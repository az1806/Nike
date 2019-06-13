package com.Nike.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Nike.Dao.BannerDao;
import com.Nike.Util.DBManager;
import com.Nike.entity.Banner;

public class BannerDaoImpl implements BannerDao{

	@Override
	public List<Banner> getAllBanner() {
		List<Banner> list = new ArrayList<Banner>();
		ResultSet rs = DBManager.querySQL("select * from banner");
		try {
			while(rs.next()){
				Banner b = new Banner();
				b.setBanner_Id(rs.getInt(1));
				b.setBanner_pic(rs.getString(2));
				list.add(b);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
		
}
