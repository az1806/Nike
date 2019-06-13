package com.Nike.entity;

public class Company {
	private int company_Id;
	private String company_Name;
	private String company_Phone;
	private String company_Email;
	private String company_address;
	private String company_profile;
	private String company_culture;
	private String Businesscall;
	private String officialwebsite;
	private String Company_Pic;
	public int getCompany_Id() {
		return company_Id;
	}
	public void setCompany_Id(int company_Id) {
		this.company_Id = company_Id;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public String getCompany_Phone() {
		return company_Phone;
	}
	public void setCompany_Phone(String company_Phone) {
		this.company_Phone = company_Phone;
	}
	public String getCompany_Email() {
		return company_Email;
	}
	public void setCompany_Email(String company_Email) {
		this.company_Email = company_Email;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public String getCompany_profile() {
		return company_profile;
	}
	public void setCompany_profile(String company_profile) {
		this.company_profile = company_profile;
	}
	public String getCompany_culture() {
		return company_culture;
	}
	public void setCompany_culture(String company_culture) {
		this.company_culture = company_culture;
	}
	public String getBusinesscall() {
		return Businesscall;
	}
	public void setBusinesscall(String businesscall) {
		Businesscall = businesscall;
	}
	public String getOfficialwebsite() {
		return officialwebsite;
	}
	public void setOfficialwebsite(String officialwebsite) {
		this.officialwebsite = officialwebsite;
	}
	public String getCompany_Pic() {
		return Company_Pic;
	}
	public void setCompany_Pic(String company_Pic) {
		Company_Pic = company_Pic;
	}
	public Company(int company_Id, String company_Name, String company_Phone,
			String company_Email, String company_address,
			String company_profile, String company_culture,
			String businesscall, String officialwebsite, String company_Pic) {
		super();
		this.company_Id = company_Id;
		this.company_Name = company_Name;
		this.company_Phone = company_Phone;
		this.company_Email = company_Email;
		this.company_address = company_address;
		this.company_profile = company_profile;
		this.company_culture = company_culture;
		Businesscall = businesscall;
		this.officialwebsite = officialwebsite;
		Company_Pic = company_Pic;
	}
	public Company() {
		super();
	}
	@Override
	public String toString() {
		return "Company [company_Id=" + company_Id + ", company_Name="
				+ company_Name + ", company_Phone=" + company_Phone
				+ ", company_Email=" + company_Email + ", company_address="
				+ company_address + ", company_profile=" + company_profile
				+ ", company_culture=" + company_culture + ", Businesscall="
				+ Businesscall + ", officialwebsite=" + officialwebsite
				+ ", Company_Pic=" + Company_Pic + "]";
	}
	

}
