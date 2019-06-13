package com.Nike.entity;

public class Product {
		private int Product_Id;
		private String Product_Name;
		private String Product_type;
		private String Product_price;
		private String Product_content;
		private String Product_pic;
		
		
		public int getProduct_Id() {
			return Product_Id;
		}
		public void setProduct_Id(int product_Id) {
			Product_Id = product_Id;
		}
		public String getProduct_Name() {
			return Product_Name;
		}
		public void setProduct_Name(String product_Name) {
			Product_Name = product_Name;
		}
		public String getProduct_type() {
			return Product_type;
		}
		public void setProduct_type(String product_type) {
			Product_type = product_type;
		}
		public String getProduct_price() {
			return Product_price;
		}
		public void setProduct_price(String product_price) {
			Product_price = product_price;
		}
		public String getProduct_content() {
			return Product_content;
		}
		public void setProduct_content(String product_content) {
			Product_content = product_content;
		}
		public String getProduct_pic() {
			return Product_pic;
		}
		public void setProduct_pic(String product_pic) {
			Product_pic = product_pic;
		}
		public Product() {
			super();
		}
		public Product(int product_Id, String product_Name,
				String product_type, String product_price,
				String product_content, String product_pic) {
			super();
			Product_Id = product_Id;
			Product_Name = product_Name;
			Product_type = product_type;
			Product_price = product_price;
			Product_content = product_content;
			Product_pic = product_pic;
		}
		@Override
		public String toString() {
			return "Product [Product_Id=" + Product_Id + ", Product_Name="
					+ Product_Name + ", Product_type=" + Product_type
					+ ", Product_price=" + Product_price + ", Product_content="
					+ Product_content + ", Product_pic=" + Product_pic + "]";
		}
		
}
