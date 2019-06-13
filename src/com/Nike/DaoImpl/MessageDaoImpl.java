package com.Nike.DaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Nike.Dao.MessageDao;
import com.Nike.Util.DBManager;
import com.Nike.entity.Message;
import com.mysql.jdbc.ResultSet;

public class MessageDaoImpl implements MessageDao{

	@Override
	public List<Message> getAllMessage() {
		List<Message> list = new ArrayList<Message>();
		ResultSet rs = DBManager.querySQL("select * from message");
		try {
			while(rs.next()){
				Message m = new Message();
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setPhone(rs.getString(3));
				m.setEmail(rs.getString(4));
				m.setContent(rs.getString(5));
				m.setState(rs.getString(6));
				list.add(m);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public int deleteMessageById(int Id) {
		
		return DBManager.updateSQL("delete from message where Id="+Id);
	}


	@Override
	public List<Message> seachMessage(String state) {
		List<Message> list = new ArrayList<Message>();
		ResultSet rs = DBManager.querySQL("select * from message where state like'%"+state+"%';");
		try {
			while(rs.next()){
				 Message m = new Message();
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setPhone(rs.getString(3));
				m.setEmail(rs.getString(4));
				m.setContent(rs.getString(5));
				m.setState(rs.getString(6));
				list.add(m);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public Message getMessageById(int Id) {
		Message m = new Message();
		ResultSet rs = DBManager.querySQL("select * from message where Id='"+Id+"'");
		try {
			while(rs.next()){
			
				m.setId(rs.getInt(1));
				m.setName(rs.getString(2));
				m.setPhone(rs.getString(3));
				m.setEmail(rs.getString(4));
				m.setContent(rs.getString(5));
				m.setState(rs.getString(6));
				
			}
			return m;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public int updateMessageById(int Id,String state) {
		return DBManager.updateSQL("update message set state='"+state+"' where Id='"+Id+"'");
	}

}
