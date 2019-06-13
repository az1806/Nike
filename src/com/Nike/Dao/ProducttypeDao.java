package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.Producttype;

public interface ProducttypeDao {
		List<Producttype> getAllProducttype();
		
		
		/**
		 * 添加产品分类
		 * @param type_Name 添加的名称
		 * @return	返回受影响行数
		 */
		int addProducttype(String type_Name);
		
		/**
		 * 删除产品分类
		 * @param type_Id 编号
		 * @return 返回受影响行数
		 */
		int deletetypeById(int type_Id);
		
		Producttype updateProducttypeById(int type_Id);
		
		int updatesProducttypeById(int type_Id,String type_Name);
}
