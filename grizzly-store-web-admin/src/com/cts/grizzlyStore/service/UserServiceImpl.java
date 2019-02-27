package com.cts.grizzlyStore.service;

import com.cts.grizzlyStore.bean.Profile;
import com.cts.grizzlyStore.dao.UserDAO;
import com.cts.grizzlyStore.dao.UserDAOImpl;

public class UserServiceImpl implements UserService {
		
	UserDAO dao=new UserDAOImpl();
	@Override
	public int registerUser(Profile profile) {
		// TODO Auto-generated method stub
		return dao.registerUser(profile);
	
	}
	public Profile getUserProfile(String id)
	{
		return dao.getUserProfile(id);
	}

}
