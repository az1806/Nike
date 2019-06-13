package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.Newstype;

public interface NewstypeDao {
	List<Newstype> getAllNewstype();

	int addNewstype(String type_Name);

	int deletNewstypeById(int type_Id);


}
