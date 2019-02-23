package com.cts.grizzlyStore.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.grizzlyStore.bean.Category;
import com.cts.grizzlyStore.service.CategoryService;
import com.cts.grizzlyStore.service.CategoryServiceImpl;

/**
 * Servlet implementation class CategoryServlet
 */
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryServlet() {
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
		String categorytype=request.getParameter("categoryType");
		String description=request.getParameter("description");
		int products=Integer.parseInt(request.getParameter("products"));
		
		Category category=new Category(categorytype,description,products);
		CategoryService categoryService=CategoryServiceImpl.getInstance();
		if("success".equals(categoryService.addCategory(category)))
		{
			response.sendRedirect("success.html");
		}
		
		
		
				
	}

}
