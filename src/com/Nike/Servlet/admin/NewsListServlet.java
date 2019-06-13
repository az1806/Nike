 	package com.Nike.Servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.NewsDao;
import com.Nike.Dao.NewstypeDao;
import com.Nike.DaoImpl.NewsDaoImpl;
import com.Nike.DaoImpl.NewstypeDaoImpl;
import com.Nike.entity.News;
import com.Nike.entity.Newstype;

public class NewsListServlet extends BaseServlet {
			NewsDao neDao = new NewsDaoImpl();
			NewstypeDao ntDao = new NewstypeDaoImpl();
	public void getAllNews(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				List<News> nlist = neDao.getAllNews();
				request.setAttribute("nlist", nlist);
				List<Newstype> nslist = ntDao.getAllNewstype();
				request.setAttribute("nslist", nslist);
				request.getRequestDispatcher("newslist.jsp").forward(request, response);
	}
	public void addNews(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ntitle = java.net.URLDecoder.decode(request.getParameter("ntitle"),  "utf-8");
		String ncon = java.net.URLDecoder.decode(request.getParameter("ncon"),  "utf-8");
		String ndate = java.net.URLDecoder.decode(request.getParameter("ndate"),  "utf-8");
		String type = java.net.URLDecoder.decode(request.getParameter("type"),  "utf-8");
		int n = neDao.addNews(ntitle, ncon, ndate, type);
		if(n>0){
			List<News> nlist = neDao.getAllNews();
			request.setAttribute("nlist", nlist);
			List<Newstype> nslist = ntDao.getAllNewstype();
			request.setAttribute("nslist", nslist);
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
					List<Newstype> nslist = ntDao.getAllNewstype();
					request.setAttribute("nslist", nslist);
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
				int id = Integer.parseInt(request.getParameter("id"));
				String ncon = java.net.URLDecoder.decode(request.getParameter("ncon"),  "utf-8");
				String ntype = java.net.URLDecoder.decode(request.getParameter("ntype"),  "utf-8");
				int n = neDao.updatesNewsById(ntype,ncon,id );
				if(n>0){
					List<News> nlist = neDao.getAllNews();
					request.setAttribute("nlist", nlist);
					List<Newstype> nslist = ntDao.getAllNewstype();
					request.setAttribute("nslist", nslist);
					request.getRequestDispatcher("newslist.jsp").forward(request, response);
				}
	}
	public void searchNews(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				String types = request.getParameter("type");
				int type=0;
				if(types !=null&& !types.equals("")){
					type = Integer.parseInt(request.getParameter("type"));
				}
				String nstitle = java.net.URLDecoder.decode(request.getParameter("nstitle"),  "utf-8");
				String ncont = java.net.URLDecoder.decode(request.getParameter("ncont"),  "utf-8");
				List<News> nlist = neDao.search(nstitle, ncont, type);
				request.setAttribute("nlist", nlist);
				List<Newstype> nslist = ntDao.getAllNewstype();
				request.setAttribute("nslist", nslist);
				request.getRequestDispatcher("newslist.jsp").forward(request, response);
	}
}
