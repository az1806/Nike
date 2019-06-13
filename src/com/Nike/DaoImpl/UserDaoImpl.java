package com.Nike.DaoImpl;

import java.sql.SQLException;

import com.Nike.Dao.UserDao;
import com.Nike.Util.DBManager;
import com.Nike.entity.User;
import com.mysql.jdbc.ResultSet;

public class UserDaoImpl implements UserDao{

	@Override
	public User login(String username, String password) {
		User list = new User();
		ResultSet rs = DBManager.querySQL("SELECT * FROM `user` WHERE username='"+username+"'AND`password`='"+password+"'");
		try {
			while(rs.next()){
				list.setUsername(rs.getString(1));
				list.setPassword(rs.getString(2));
				return list;
			}
			System.out.println(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean login1(String username, String password) {
		User us = new User();
		ResultSet rs = DBManager.querySQL("SELECT * FROM `user` WHERE username='"+username+"'AND`password`='"+password+"'");
		try {
			while(rs.next()){
				us.setUserId(rs.getInt(1));
				us.setUsername(rs.getString(2));
				us.setPassword(rs.getString(3));
				return true;
			}
			System.out.println(us);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
