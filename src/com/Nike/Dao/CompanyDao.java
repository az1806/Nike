package com.Nike.Dao;

import com.Nike.entity.Company;

public interface CompanyDao {
	Company getAllCompany();

	Company updateCompanyById(int Company_Id);

	int updatesCompanyById(int Company_Id, String Company_Name,
			String Company_Phone, String Company_Emial, String Company_address,
			String Company_profile, String Company_culture,
			String Businesscall, String offcialwebsite, String Company_Pic);
}
