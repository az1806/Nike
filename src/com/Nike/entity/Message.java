package com.Nike.entity;

public class Message {
	private int Id;
	private String Name;
	private String Phone;
	private String Email;
	private String content;
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message() {
		super();
	}
	
	public Message(int id, String name, String phone, String email,
			String content, String state) {
		super();
		Id = id;
		Name = name;
		Phone = phone;
		Email = email;
		this.content = content;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Message [Id=" + Id + ", Name=" + Name + ", Phone=" + Phone
				+ ", Email=" + Email + ", content=" + content + ", state="
				+ state + "]";
	}
	
}
