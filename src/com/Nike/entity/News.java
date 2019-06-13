package com.Nike.entity;

public class News {
	private int news_Id;
	private String news_content;
	private int news_type;
	private String name;
	public int getNews_Id() {
		return news_Id;
	}
	public void setNews_Id(int news_Id) {
		this.news_Id = news_Id;
	}
	public String getNews_content() {
		return news_content;
	}
	public void setNews_content(String news_content) {
		this.news_content = news_content;
	}
	public int getNews_type() {
		return news_type;
	}
	public void setNews_type(int news_type) {
		this.news_type = news_type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public News() {
		super();
	}
	
	
	public News(int news_Id, String news_content, int news_type, String name) {
		super();
		this.news_Id = news_Id;
		this.news_content = news_content;
		this.news_type = news_type;
		this.name = name;
	}
	@Override
	public String toString() {
		return "News [news_Id=" + news_Id + ", news_content=" + news_content
				+ ", news_type=" + news_type + ", name=" + name + "]";
	}
	
	
}
