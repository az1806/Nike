package com.Nike.DaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Nike.Dao.NewstypeDao;
import com.Nike.Util.DBManager;
import com.Nike.entity.Newstype;
import com.mysql.jdbc.ResultSet;

public class NewstypeDaoImpl implements NewstypeDao{

	@Override
	public List<Newstype> getAllNewstype() {
		List<Newstype> list = new ArrayList<Newstype>();
		ResultSet rs = DBManager.querySQL("select * from newstype");
		try {
			while(rs.next()){
				Newstype nt = new Newstype();
				nt.setType_Id(rs.getInt(1));
				nt.setType_Name(rs.getString(2));
				list.add(nt);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int addNewstype(String type_Name) {
		return DBManager.updateSQL("insert into newstype (type_Name) value ('"+type_Name+"')");
	}

	@Override
	public int deletNewstypeById(int type_Id) {
		return DBManager.updateSQL("delete from newstype where type_Id='"+type_Id +"'");
	}



}
