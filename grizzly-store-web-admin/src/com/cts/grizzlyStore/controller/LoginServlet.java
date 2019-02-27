package com.cts.grizzlyStore.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.grizzlyStore.bean.Product;
import com.cts.grizzlyStore.bean.Profile;
import com.cts.grizzlyStore.service.LoginService;
import com.cts.grizzlyStore.service.LoginServiceImpl;
import com.cts.grizzlyStore.service.ProductService;
import com.cts.grizzlyStore.service.ProductServiceImpl;
import com.cts.grizzlyStore.service.UserService;
import com.cts.grizzlyStore.service.UserServiceImpl;



/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LoginService loginService=LoginServiceImpl.getInstance();
		UserService userService=new UserServiceImpl();
		RequestDispatcher requestdispatcher=null;
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		ProductService productService=new ProductServiceImpl();
		
		
		
		
		HttpSession session=null;
		
		if(!(loginService.aunthenticateUser(userId)))
		{
			requestdispatcher=request.getRequestDispatcher("LoginError.html");
			requestdispatcher.forward(request,response );
			
		}
		
		if(loginService.aunthenticateUser(userId) && loginService.getUserStatus(userId)>=3)
		{
			/*response.sendRedirect("admin.htm");*/
			requestdispatcher=request.getRequestDispatcher("userDeactivated.html");
			requestdispatcher.forward(request,response );
		}
			
			
		else if(loginService.authentication(userId,password))
		{
			
			if(loginService.getUserStatus(userId)<3)
			{
					session=request.getSession();
					session.setAttribute("userName", userId);
					Profile profile = userService.getUserProfile(userId);
					session.setAttribute("user",profile );
					List<Product> products=productService.getProducts();
					session.setAttribute("Prod", products);
					requestdispatcher=request.getRequestDispatcher("Admin_listProduct.jsp");
					requestdispatcher.forward(request, response);
					
					
		
			}
			else
			{
				requestdispatcher = request.getRequestDispatcher("userDeactivated.html");
				requestdispatcher.forward(request, response);
			}
			
					
		}
		
		else
		{
			
			
				loginService.incrementUserStatus(userId);
				System.out.println(loginService.getUserStatus(userId));
				requestdispatcher = request.getRequestDispatcher("login.html");
			    requestdispatcher.forward(request, response);
		}
		
	}
}
		



