package com.cts.grizzlyStore.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.grizzlyStore.bean.Profile;
import com.cts.grizzlyStore.service.UserService;
import com.cts.grizzlyStore.service.UserServiceImpl;


/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 
     */
	
	RequestDispatcher requestDispatcher = null;  
	UserService userService = new UserServiceImpl();
	
    public RegistrationServlet() {
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
		// TODO Auto-generated method stub
		
		String userId = request.getParameter("userName");
		String userType = request.getParameter("userType");
		String password = request.getParameter("password");
		long contact = Long.parseLong(request.getParameter("contactNumber"));
		String address = request.getParameter("address");
		
	Profile user = new Profile(userId,password,contact,userType,address);	
		int result = userService.registerUser(user);
		if(result==1)
		{
		requestDispatcher = request.getRequestDispatcher("Registered.html");
		   requestDispatcher.forward(request, response);
	}
		}
	}

