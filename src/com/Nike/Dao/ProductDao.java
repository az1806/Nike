package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.Product;

public interface ProductDao {
		List<Product> getAllProduct();
		/**
		 * 添加商品
		 * @param Product_Name 名称
		 * @param type_Id	类型id
		 * @param Product_price	单价	
		 * @param Product_content	简介
		 * @param Product_Pic	图片
		 * @return	返回受影响行数
		 */
		int addProduct(String Product_Name,String type_Id,double Product_price,String Product_content,String Product_Pic );
		
		/**
		 * 删除产品
		 * @param Product_Id 根据编号删除
		 * @return	数据库受影响行数
		 */
		int deleteProductById(int Product_Id);
		
		Product updateProductById(int Product_Id);
		
		int updatesProductById(int Product_Id, String Product_Name,String type_Id,double Product_price,String Product_content,String Product_Pic);

		List<Product> chaxunpro(int tid,String proname,String procon);
		

}
