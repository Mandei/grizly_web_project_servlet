package com.cts.grizzlyStore.dao;

public interface LoginDAO {
	
	
	public int getUserStatus(String userId);
	public String getUserType(String userId);
	public boolean authentication(String userId,String password) ;
	public boolean aunthenticateUser(String userId);
	
	public int resetUserStatus(String id);
	public int incrementUserStatus(String id);
		
	
	
}
