package com.Nike.DaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Nike.Dao.ProductDao;
import com.Nike.Util.DBManager;
import com.Nike.entity.Product;
import com.mysql.jdbc.ResultSet;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getAllProduct() {
		List<Product> list = new ArrayList<Product>();
		ResultSet rs = DBManager.querySQL("select * from Product");
		try {
			while (rs.next()) {
				Product p = new Product();
				p.setProduct_Id(rs.getInt("Product_Id"));
				p.setProduct_Name(rs.getString("Product_Name"));
				p.setProduct_type(rs.getString("type_Id"));
				p.setProduct_price(rs.getString("Product_price"));
				p.setProduct_content(rs.getString("Product_content"));
				p.setProduct_pic(rs.getString("Product_pic"));
				list.add(p);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int addProduct(String Product_Name, String type_Id,
			double Product_price, String Product_content, String Product_Pic) {

		return DBManager
				.updateSQL("INSERT INTO PRODUCT(Product_Name,type_Id,Product_price,Product_content,product_pic) values ('"
						+ Product_Name
						+ "','"
						+ type_Id
						+ "','"
						+ Product_price
						+ "','"
						+ Product_content
						+ "','"
						+ Product_Pic + "')");
	}

	@Override
	public int deleteProductById(int Product_Id) {

		return DBManager.updateSQL("delete from product where Product_Id="
				+ Product_Id);
	}

	@Override
	public Product updateProductById(int Product_Id) {
		Product p = new Product();
		ResultSet rs = DBManager
				.querySQL("select*from product WHERE Product_Id='" + Product_Id
						+ "'");
		try {
			while (rs.next()) {

				p.setProduct_Id(rs.getInt("Product_Id"));
				p.setProduct_Name(rs.getString("Product_Name"));
				p.setProduct_type(rs.getString("type_Id"));
				p.setProduct_price(rs.getString("Product_price"));
				p.setProduct_content(rs.getString("Product_content"));
				p.setProduct_pic(rs.getString("Product_pic"));
			}
			return p;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public int updatesProductById(int Product_Id, String Product_Name,
			String type_Id, double Product_price, String Product_content,
			String Product_Pic) {
		return DBManager.updateSQL("update product set Product_Name='"
				+ Product_Name + "',type_Id='" + type_Id + "',Product_price='"
				+ Product_price + "',Product_content='" + Product_content
				+ "',Product_Pic='" + Product_Pic + "' where Product_Id='"
				+ Product_Id + "'");
	}

	@Override
	public List<Product> getAllProductt() {
		List<Product> list = new ArrayList<Product>();
		ResultSet rs = DBManager.querySQL("select * from Product");
		try {
			while (rs.next()) {
				Product p = new Product();
				p.setProduct_Id(rs.getInt("Product_Id"));
				p.setProduct_Name(rs.getString("Product_Name"));
				p.setProduct_type(rs.getString("type_Id"));
				p.setProduct_price(rs.getString("Product_price"));
				p.setProduct_content(rs.getString("Product_content"));
				p.setProduct_pic(rs.getString("Product_pic"));
				list.add(p);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
   //随机六个//
	@Override
	public List<Product> liujiquery() {
		List<Product> list = new ArrayList<Product>();
		ResultSet rs = DBManager.querySQL("select * from Product order by rand() limit 6");
		try {
			while (rs.next()) {
				Product p = new Product();
				p.setProduct_Id(rs.getInt("Product_Id"));
				p.setProduct_Name(rs.getString("Product_Name"));
				p.setProduct_type(rs.getString("type_Id"));
				p.setProduct_price(rs.getString("Product_price"));
				p.setProduct_content(rs.getString("Product_content"));
				p.setProduct_pic(rs.getString("Product_pic"));
				list.add(p);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
//根据分类查询产品//
	@Override
	public List<Product> typequery(int type_Id) {
		List<Product> list = new ArrayList<Product>();
		ResultSet rs = DBManager.querySQL("select * from Product where type_Id="+type_Id);
		try {
			while (rs.next()) {
				Product p = new Product();
				p.setProduct_Id(rs.getInt("Product_Id"));
				p.setProduct_Name(rs.getString("Product_Name"));
				p.setProduct_type(rs.getString("type_Id"));
				p.setProduct_price(rs.getString("Product_price"));
				p.setProduct_content(rs.getString("Product_content"));
				p.setProduct_pic(rs.getString("Product_pic"));
				list.add(p);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
