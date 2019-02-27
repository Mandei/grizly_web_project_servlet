package com.cts.grizzlyStore.service;

import com.cts.grizzlyStore.bean.Profile;

public interface UserService {
	
	public int registerUser(Profile profile);
	public Profile getUserProfile(String id);
}
