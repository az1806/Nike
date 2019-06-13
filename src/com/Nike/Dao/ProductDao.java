package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.Product;

public interface ProductDao {
		List<Product> getAllProduct();
		/**
		 * �����Ʒ
		 * @param Product_Name ����
		 * @param type_Id	����id
		 * @param Product_price	����	
		 * @param Product_content	���
		 * @param Product_Pic	ͼƬ
		 * @return	������Ӱ������
		 */
		int addProduct(String Product_Name,String type_Id,double Product_price,String Product_content,String Product_Pic );
		
		/**
		 * ɾ����Ʒ
		 * @param Product_Id ���ݱ��ɾ��
		 * @return	���ݿ���Ӱ������
		 */
		int deleteProductById(int Product_Id);
		
		Product updateProductById(int Product_Id);
		
		int updatesProductById(int Product_Id, String Product_Name,String type_Id,double Product_price,String Product_content,String Product_Pic);

		List<Product> chaxunpro(int tid,String proname,String procon);
		

}
