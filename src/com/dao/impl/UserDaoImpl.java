package com.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.UserDao;
import com.entity.User;
import com.mysql.jdbc.ResultSet;
import com.util.JdbcUtil;

public class UserDaoImpl implements UserDao{
	public boolean insertUser(String name, String pwd) {
		int n = JdbcUtil.updateSQL("insert user (username,password)  values ('"
				+ name + "','" + pwd + "')");
		if (n == 1) {
			return true;
		}
		return false;
	}
/**
 * 建立一个动态数组存储数据，方便调用
 */
	public ArrayList<User> selectUsers() {
		ArrayList<User> users = new ArrayList<User>();

		ResultSet rs = JdbcUtil.querySQL("select * from user");
		if (rs != null) {
			try {
				while (rs.next()) {
					User u = new User();
					u.setId(rs.getInt("id"));
					u.setUsername(rs.getString("username"));
					u.setPwd(rs.getString("password"));
					users.add(u);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return users;
	}
/**
 * 查询用户信息
 */
	public User selectUserByName(String name) {
		ResultSet rs = JdbcUtil
				.querySQL("select * from user where username = '" + name + "'");
		if (rs != null) {
			try {
				while (rs.next()) {
					User u = new User();
					u.setId(rs.getInt("id"));
					u.setUsername(rs.getString("username"));
					u.setPwd(rs.getString("password"));
					
					
					return u;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;
	}

}
