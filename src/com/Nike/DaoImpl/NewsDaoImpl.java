package com.Nike.DaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Nike.Dao.NewsDao;
import com.Nike.Util.DBManager;
import com.Nike.entity.News;
import com.mysql.jdbc.ResultSet;

public class NewsDaoImpl implements NewsDao {

	@Override
	public List<News> getAllNews() {
		List<News> list = new ArrayList<News>();
		ResultSet rs = DBManager.querySQL("select * from news");
		try {
			while (rs.next()) {
				News n = new News();
				n.setNews_Id(rs.getInt(1));
				n.setNews_content(rs.getString(2));
				n.setNews_type(rs.getInt(3));
				list.add(n);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int addNews(String news_content, String news_type) {
		return DBManager
				.updateSQL("insert into news (news_content,news_type) values('"
						+ news_content + "','" + news_type + "')");
	}

	@Override
	public int deletNewsById(int news_Id) {

		return DBManager.updateSQL("delete from news where news_Id='" + news_Id
				+ "'");
	}

	@Override
	public News updateNewsById(int news_Id) {

		News n = new News();
		ResultSet rs = DBManager.querySQL("select * from news where news_Id='"
				+ news_Id + "' ");
		try {
			while (rs.next()) {

				n.setNews_Id(rs.getInt(1));
				n.setNews_content(rs.getString(2));
				n.setNews_type(rs.getInt(3));
			}
			return n;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updatesNewsById(String news_content, String news_type,
			int news_Id) {
		return DBManager.updateSQL("update news set news_content='"
				+ news_content + "',news_type='" + news_type
				+ "' where news_Id='" + news_Id + "'");
	}

	@Override
	public List<News> getAllNews(int id) {
		ResultSet rs = DBManager.querySQL("select * from news where news_type="
				+ id);
		List<News> list = new ArrayList<News>();
		try {
			while (rs.next()) {
				News n = new News();
				n.setNews_Id(rs.getInt(1));
				n.setNews_content(rs.getString(2));
				n.setNews_type(rs.getInt(3));
				n.setName(rs.getString(4));
				list.add(n);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<News> typequery(int news_type) {
		List<News> list = new ArrayList<News>();
		ResultSet rs = DBManager.querySQL("select * from news where news_type="
				+ news_type);
		try {
			while (rs.next()) {
				News n = new News();
				n.setNews_Id(rs.getInt(1));
				n.setNews_content(rs.getString(2));
				n.setNews_type(rs.getInt(3));
				n.setName(rs.getString(4));
				list.add(n);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public News idquery(int news_Id) {
		News n = new News();
		ResultSet rs = DBManager.querySQL("select * from news where news_Id="
				+ news_Id);
		try {
			while (rs.next()) {

				n.setNews_Id(rs.getInt(1));
				n.setNews_content(rs.getString(2));
				n.setNews_type(rs.getInt(3));
				n.setName(rs.getString(4));
			}
			return n;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
