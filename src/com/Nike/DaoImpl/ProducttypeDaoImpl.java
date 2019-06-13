package com.Nike.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Nike.Dao.ProducttypeDao;
import com.Nike.Util.DBManager;
import com.Nike.entity.Producttype;

public class ProducttypeDaoImpl implements ProducttypeDao{

	@Override
	public List<Producttype> getAllProducttype() {
		List<Producttype> list = new ArrayList<Producttype>();
		ResultSet rs = DBManager.querySQL("select * from producttype");
		try {
			while(rs.next()){
				Producttype pt = new Producttype();
				pt.setType_Id(rs.getInt(1));
				pt.setType_Name(rs.getString(2));
				list.add(pt);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int addProducttype(String type_Name) {
		
		 int n = DBManager.updateSQL("insert into producttype(type_Name) value('"+type_Name+"')");
		 return n;
	}

	@Override
	public int deletetypeById(int type_Id) {
		return DBManager.updateSQL("delete from producttype where type_Id="+type_Id);
	}

	@Override
	public Producttype updateProducttypeById(int type_Id) {
		
		Producttype pt = new Producttype();
		ResultSet rs = DBManager.querySQL("select * from producttype where type_Id='"+type_Id+"'");
		try {
			while(rs.next()){
				pt.setType_Id(rs.getInt(1));
				pt.setType_Name(rs.getString(2));
			}
			return pt;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updatesProducttypeById(int type_Id, String type_Name) {
		
		
		return DBManager.updateSQL("update producttype set type_Name='"+type_Name+"' where type_Id='"+type_Id+"'");
	}
}

