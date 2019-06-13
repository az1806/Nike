package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.News;

public interface NewsDao {
	List<News> getAllNews();
	
	
	int addNews(String news_title,String news_content,String news_date,String news_type);
	
	int deletNewsById(int news_Id);
	
	News updateNewsById(int news_Id);
	int updatesNewsById(String news_content,String news_type,int news_Id);
	
	List<News> search(String news_title,String news_content,int news_type);
}
