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
import com.cts.grizzlyStore.service.ProductService;
import com.cts.grizzlyStore.service.ProductServiceImpl;
import com.cts.grizzlyStore.service.UserService;
import com.cts.grizzlyStore.service.UserServiceImpl;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 
     */
	RequestDispatcher requestdispatcher=null;
	ProductService productService=null;
	Product product=null;
	HttpSession session=null;
	UserService userService=new UserServiceImpl();
	
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		session=request.getSession(false);
		
		requestdispatcher=request.getRequestDispatcher("Admin_addProduct.jsp");
		requestdispatcher.forward(request,response );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  productId=request.getParameter("productId");
		String  categoryId=request.getParameter("catgoryId");
		String  name=request.getParameter("name");
		String  description=request.getParameter("description");
		String brand=request.getParameter("brand");
		int price=Integer.parseInt(request.getParameter("price"));
		
		product=new Product(productId, categoryId, name, description, price, brand);
		
		productService=new ProductServiceImpl();
		String productavail=productService.addPropduct(product);
		
		if("success".equals(productavail))
				{
					session=request.getSession(false);
					List<Product> products=productService.getProducts();
					session.setAttribute("Prod", products);
					requestdispatcher=request.getRequestDispatcher("Admin_listProduct.jsp");
					requestdispatcher.forward(request,response );
				}
		
		else
		{
			System.out.println("failure somewhere!");
		}
			
			
		
	}

}
