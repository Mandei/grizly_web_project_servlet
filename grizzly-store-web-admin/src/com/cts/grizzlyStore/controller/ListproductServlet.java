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
import com.cts.grizzlyStore.service.ProductService;
import com.cts.grizzlyStore.service.ProductServiceImpl;

/**
 * Servlet implementation class ListproductServlet
 */
public class ListproductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	ProductService productService=new ProductServiceImpl();
	RequestDispatcher requestdispatcher=null;
	
    public ListproductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		List<Product> products=productService.getProducts();
		session.setAttribute("Prod", products);
		requestdispatcher=request.getRequestDispatcher("Admin_listProduct.jsp");
		requestdispatcher.forward(request, response);
	}

}
