package com.Nike.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Nike.Dao.CompanyDao;
import com.Nike.Util.DBManager;
import com.Nike.entity.Company;

public class CompanyDaoImpl implements CompanyDao {

	@Override
	public Company getAllCompany() {
		Company list = new Company();
		ResultSet rs = DBManager.querySQL("select * from company");
		try {
			while (rs.next()) {

				list.setCompany_Id(rs.getInt("Company_id"));
				list.setCompany_Name(rs.getString("Company_name"));
				list.setCompany_Phone(rs.getString("Company_phone"));
				list.setCompany_Email(rs.getString("Company_emial"));
				list.setCompany_address(rs.getString("Company_address"));
				list.setCompany_profile(rs.getString("Company_profile"));
				list.setCompany_culture(rs.getString("Company_culture"));
				list.setBusinesscall(rs.getString("businesscall"));
				list.setOfficialwebsite(rs.getString("officialwebsite"));
				list.setCompany_Pic(rs.getString("Company_pic"));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Company updateCompanyById(int Company_Id) {
		Company list = new Company();
		ResultSet rs = DBManager.querySQL("select * from company where Company_Id='"
						+ Company_Id + "'");
		try {
			while (rs.next()) {

				list.setCompany_Id(rs.getInt("Company_id"));
				list.setCompany_Name(rs.getString("Company_name"));
				list.setCompany_Phone(rs.getString("Company_phone"));
				list.setCompany_Email(rs.getString("Company_emial"));
				list.setCompany_address(rs.getString("Company_address"));
				list.setCompany_profile(rs.getString("Company_profile"));
				list.setCompany_culture(rs.getString("Company_culture"));
				list.setBusinesscall(rs.getString("businesscall"));
				list.setOfficialwebsite(rs.getString("officialwebsite"));
				list.setCompany_Pic(rs.getString("Company_pic"));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updatesCompanyById(int Company_Id, String Company_Name,
			String Company_Phone, String Company_Emial, String Company_address,
			String Company_profile, String Company_culture,
			String Businesscall, String offcialwebsite, String Company_Pic) {
		return DBManager.updateSQL("update company set Company_Name='"
				+ Company_Name + "',Company_Phone='" + Company_Phone
				+ "',Company_Emial='" + Company_Emial + "',Company_address='"
				+ Company_address + "',Company_profile='" + Company_profile
				+ "',Company_culture='" + Company_culture + "',Businesscall='"
				+ Businesscall + "',officialwebsite='" + offcialwebsite
				+ "',Company_Pic='" + Company_Pic + "' where Company_Id='"+Company_Id+"'");
	}

}
