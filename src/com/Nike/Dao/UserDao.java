package com.Nike.Dao;

import com.Nike.entity.User;

public interface UserDao {
	User login(String name,String password);
	
	  boolean login1(String username,String password );
}
