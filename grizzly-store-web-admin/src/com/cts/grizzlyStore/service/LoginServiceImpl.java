package com.cts.grizzlyStore.service;

import com.cts.grizzlyStore.dao.LoginDAO;
import com.cts.grizzlyStore.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	
	


	private LoginServiceImpl(){};
	
	private static LoginServiceImpl loginServiceImpl;
	
	public static LoginServiceImpl getInstance()
	{
		if(loginServiceImpl==null)
		{
			loginServiceImpl=new LoginServiceImpl();
			return loginServiceImpl;
		}
		else
			return loginServiceImpl;
	}
	
	
	
	private LoginDAO dao=LoginDAOImpl.getInstance();
	
	
	
	
	public int getUserStatus(String userId) {
		
		return dao.getUserStatus(userId);
	}
	

	public String getUserType(String userId) {
		
		return dao.getUserType(userId);
	}
	

	public boolean authentication(String userId, String password) {
		
		return dao.authentication(userId, password);
	}
	
	public String authorization(String userId) {
		
		return dao.getUserType(userId);
	}

}
