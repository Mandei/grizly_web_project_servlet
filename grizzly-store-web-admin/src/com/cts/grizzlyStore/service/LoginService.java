package com.cts.grizzlyStore.service;

import com.cts.grizzlyStore.bean.Profile;

public interface LoginService {

	
	public int getUserStatus(String userId);
	public String getUserType(String userId);
	public boolean authentication(String userId,String password) ;
	public String authorization(String userId);
	public boolean aunthenticateUser(String userId);
	public int resetUserStatus(String id);
	public int incrementUserStatus(String id);
}
