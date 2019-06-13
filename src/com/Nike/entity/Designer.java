package com.Nike.entity;

public class Designer {
	private int designer_Id;
	private String designer_Name;
	private String designer_Sex;
	private String designer_About;
	private String designer_Pic;
	public int getDesigner_Id() {
		return designer_Id;
	}
	public void setDesigner_Id(int designer_Id) {
		this.designer_Id = designer_Id;
	}
	public String getDesigner_Name() {
		return designer_Name;
	}
	public void setDesigner_Name(String designer_Name) {
		this.designer_Name = designer_Name;
	}
	public String getDesigner_Sex() {
		return designer_Sex;
	}
	public void setDesigner_Sex(String designer_Sex) {
		this.designer_Sex = designer_Sex;
	}
	public String getDesigner_About() {
		return designer_About;
	}
	public void setDesigner_About(String designer_About) {
		this.designer_About = designer_About;
	}
	public String getDesigner_Pic() {
		return designer_Pic;
	}
	public void setDesigner_Pic(String designer_Pic) {
		this.designer_Pic = designer_Pic;
	}
	public Designer() {
		super();
	}
	public Designer(int designer_Id, String designer_Name, String designer_Sex,
			String designer_About, String designer_Pic) {
		super();
		this.designer_Id = designer_Id;
		this.designer_Name = designer_Name;
		this.designer_Sex = designer_Sex;
		this.designer_About = designer_About;
		this.designer_Pic = designer_Pic;
	}
	@Override
	public String toString() {
		return "Designer [designer_Id=" + designer_Id + ", designer_Name="
				+ designer_Name + ", designer_Sex=" + designer_Sex
				+ ", designer_About=" + designer_About + ", designer_Pic="
				+ designer_Pic + "]";
	}
	
}
