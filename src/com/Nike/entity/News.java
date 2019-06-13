package com.Nike.entity;

public class News {
	private int news_Id;
	private String news_title;
	private String news_content;
	private String new_date;
	public String getNews_title() {
		return news_title;
	}
	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}
	public String getNew_date() {
		return new_date;
	}
	public void setNew_date(String new_date) {
		this.new_date = new_date;
	}
	private String news_type;
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
	public String getNews_type() {
		return news_type;
	}
	public void setNews_type(String news_type) {
		this.news_type = news_type;
	}
	public News() {
		super();
	}
	
	public News(int news_Id, String news_title, String news_content,
			String new_date, String news_type) {
		super();
		this.news_Id = news_Id;
		this.news_title = news_title;
		this.news_content = news_content;
		this.new_date = new_date;
		this.news_type = news_type;
	}
	@Override
	public String toString() {
		return "News [news_Id=" + news_Id + ", news_title=" + news_title
				+ ", news_content=" + news_content + ", new_date=" + new_date
				+ ", news_type=" + news_type + "]";
	}
	
	
}
