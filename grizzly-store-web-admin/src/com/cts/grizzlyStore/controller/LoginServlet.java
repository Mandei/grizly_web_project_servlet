package com.cts.grizzlyStore.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.grizzlyStore.service.LoginService;
import com.cts.grizzlyStore.service.LoginServiceImpl;

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
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		HttpSession session=null;
		
		if(loginService.authentication(userId, password))
		{
			/*response.sendRedirect("admin.htm");*/
			RequestDispatcher requestdispatcher=null;
			
			
			String authorization=loginService.authorization(userId);
			int userStatus=loginService.getUserStatus(userId);
			System.out.println(userStatus);
			
			if("A".equals(authorization))
			{
				
					session=request.getSession();
					session.setAttribute("userName", userId);
					requestdispatcher=request.getRequestDispatcher("Admin_addProduct.jsp");
					requestdispatcher.forward(request,response );
				
				
			}
			
					
		}
		
		else
				{
					System.out.println("failure");
					response.sendRedirect("login.html");
				}
		
	}
}
		



