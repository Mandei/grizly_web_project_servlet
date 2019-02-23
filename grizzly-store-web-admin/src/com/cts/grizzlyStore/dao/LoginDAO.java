package com.cts.grizzlyStore.dao;

public interface LoginDAO {
	
	
	public int getUserStatus(String userId);
	public String getUserType(String userId);
	public boolean authentication(String userId,String password) ;
	
	
		
	
	
}
