package com.Nike.DaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Nike.Dao.DesignerDao;
import com.Nike.Util.DBManager;
import com.Nike.entity.Designer;
import com.mysql.jdbc.ResultSet;

public class DesignerDaoImpl implements DesignerDao {

	@Override
	public List<Designer> getAllDesigner() {
		List<Designer> list = new ArrayList<Designer>();
		ResultSet rs = DBManager.querySQL("select * from designer");
		try {
			while (rs.next()) {
				Designer d = new Designer();
				d.setDesigner_Id(rs.getInt(1));
				d.setDesigner_Name(rs.getString(2));
				d.setDesigner_Sex(rs.getString(3));
				d.setDesigner_About(rs.getString(4));
				d.setDesigner_Pic(rs.getString(5));
				list.add(d);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int addDesigner(String designer_Name, String designer_Sex,
			String designer_About, String designer_Pic) {

		return DBManager
				.updateSQL("INSERT INTO designer(designer_Name,designer_Sex,designer_About,designer_Pic)VALUES('"
						+ designer_Name
						+ "','"
						+ designer_Sex
						+ "','"
						+ designer_About + "','" + designer_Pic + "')");
	}

	@Override
	public int deletDesignerById(int designer_Id) {
	
		return DBManager.updateSQL("delete from designer where designer_Id="+designer_Id);
	}

	@Override
	public Designer updateDesignerById(int designer_Id) {
		Designer d = new Designer();
		ResultSet rs = DBManager.querySQL("select * from designer where designer_Id='"+designer_Id+"'");
		try {
			while (rs.next()) {
				d.setDesigner_Id(rs.getInt(1));
				d.setDesigner_Name(rs.getString(2));
				d.setDesigner_Sex(rs.getString(3));
				d.setDesigner_About(rs.getString(4));
				d.setDesigner_Pic(rs.getString(5));
			}
			return d;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public int updatesDesignerById(int designer_Id, String designer_Name,
			String designer_Sex, String designer_About, String designer_Pic) {
		return DBManager.updateSQL("update designer set designer_Name='"+designer_Name+"',designer_Sex='"+designer_Sex+"',designer_About='"+designer_About+"',designer_Pic='"+designer_Pic+"' where designer_Id='"+designer_Id+"'");
	}

}
