package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.News;

public interface NewsDao {
	List<News> getAllNews();

	List<News> getAllNews(int id);

	List<News> typequery(int news_type);

	int addNews(String news_content, String news_type);

	int deletNewsById(int news_Id);

	News updateNewsById(int news_Id);

	int updatesNewsById(String news_content, String news_type, int news_Id);

	News idquery(int news_Id);

}
