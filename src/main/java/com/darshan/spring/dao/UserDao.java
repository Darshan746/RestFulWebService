package com.darshan.spring.dao;

import com.darshan.spring.model.User;

public interface UserDao {
	
	public User getUserByName(String name);
}
