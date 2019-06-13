package com.Nike.entity;

public class Banner {
	private int banner_Id;
	private String banner_pic;
	public int getBanner_Id() {
		return banner_Id;
	}
	public void setBanner_Id(int banner_Id) {
		this.banner_Id = banner_Id;
	}
	public String getBanner_pic() {
		return banner_pic;
	}
	public void setBanner_pic(String banner_pic) {
		this.banner_pic = banner_pic;
	}
	public Banner() {
		super();
	}
	public Banner(int banner_Id, String banner_pic) {
		super();
		this.banner_Id = banner_Id;
		this.banner_pic = banner_pic;
	}
	@Override
	public String toString() {
		return "Banner [banner_Id=" + banner_Id + ", banner_pic=" + banner_pic
				+ "]";
	}
	
}
