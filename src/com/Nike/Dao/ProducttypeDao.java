package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.Producttype;

public interface ProducttypeDao {
		List<Producttype> getAllProducttype();
		
		
		/**
		 * ��Ӳ�Ʒ����
		 * @param type_Name ��ӵ�����
		 * @return	������Ӱ������
		 */
		int addProducttype(String type_Name);
		
		/**
		 * ɾ����Ʒ����
		 * @param type_Id ���
		 * @return ������Ӱ������
		 */
		int deletetypeById(int type_Id);
		
		Producttype updateProducttypeById(int type_Id);
		
		int updatesProducttypeById(int type_Id,String type_Name);
}
