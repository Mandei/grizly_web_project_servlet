package com.cts.grizzlyStore.dao;

import com.cts.grizzlyStore.bean.Profile;

public interface UserDAO {

	public int registerUser(Profile user);
	public Profile getUserProfile(String id);
}
