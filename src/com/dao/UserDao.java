package com.dao;

import java.util.ArrayList;

import com.entity.User;



public interface UserDao {

	/**
	 * ����һ���û�
	 * @param name
	 * @param pwd
	 * @return
	 */
	boolean insertUser(String name,String pwd);
	
	/**
	 * ���������û�
	 * @return
	 */
	ArrayList<User> selectUsers();
	
	/**
	 * ͨ���û����ҵ�һ���û�
	 * @param name
	 * @return
	 */
	User selectUserByName(String name);
}
