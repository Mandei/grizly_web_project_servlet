package com.cts.grizzlyStore.service;

public interface LoginService {

	
	public int getUserStatus(String userId);
	public String getUserType(String userId);
	public boolean authentication(String userId,String password) ;
	public String authorization(String userId);

}
