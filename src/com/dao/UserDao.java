package com.dao;

import java.util.ArrayList;

import com.entity.User;



public interface UserDao {

	/**
	 * 插入一个用户
	 * @param name
	 * @param pwd
	 * @return
	 */
	boolean insertUser(String name,String pwd);
	
	/**
	 * 返回所有用户
	 * @return
	 */
	ArrayList<User> selectUsers();
	
	/**
	 * 通过用户名找到一个用户
	 * @param name
	 * @return
	 */
	User selectUserByName(String name);
}
