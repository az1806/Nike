package com.Nike.Servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.NewsDao;
import com.Nike.DaoImpl.NewsDaoImpl;
import com.Nike.entity.News;

public class NewsListServlet extends BaseServlet {
			NewsDao neDao = new NewsDaoImpl();
	public void getAllNews(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				List<News> nlist = neDao.getAllNews();
				request.setAttribute("nlist", nlist);
				request.getRequestDispatcher("newslist.jsp").forward(request, response);
	}
	public void addNews(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ncon = java.net.URLDecoder.decode(request.getParameter("ncon"),  "utf-8");
		String type = java.net.URLDecoder.decode(request.getParameter("type"),  "utf-8");
		int n = neDao.addNews(ncon, type);
		if(n>0){
			List<News> nlist = neDao.getAllNews();
			request.setAttribute("nlist", nlist);
			request.getRequestDispatcher("newslist.jsp").forward(request, response);
		}
	}
	public void deletNews(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				int news_Id = Integer.parseInt(request.getParameter("news_Id"));
				int n = neDao.deletNewsById(news_Id);
				if(n>0){
					List<News> nlist = neDao.getAllNews();
					request.setAttribute("nlist", nlist);
					request.getRequestDispatcher("newslist.jsp").forward(request, response);
				}
	}
	public void updateNews(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				int id = Integer.parseInt(request.getParameter("news_Id"));
				News nlist = neDao.updateNewsById(id);
				request.setAttribute("nlist", nlist);
				request.getRequestDispatcher("newslist-update.jsp").forward(request, response);
	}
	public void updatesNews(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				int id = Integer.parseInt(request.getParameter("news_Id"));
				String ncon = java.net.URLDecoder.decode(request.getParameter("ncon"),  "utf-8");
				String type = java.net.URLDecoder.decode(request.getParameter("type"),  "utf-8");
				int n = neDao.updatesNewsById(type,ncon, id );
				if(n>0){
					List<News> nlist = neDao.getAllNews();
					request.setAttribute("nlist", nlist);
					request.getRequestDispatcher("newslist.jsp").forward(request, response);
				}

	}
}
