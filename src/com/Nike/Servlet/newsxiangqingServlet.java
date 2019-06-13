package com.Nike.Servlet;

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

public class newsxiangqingServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");// 设置输出内容的编码格式
		request.setCharacterEncoding("UTF-8");// 设置输出内容的编码格式
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int news_Id = Integer.parseInt(request.getParameter("news_Id"));
		NewsDao news = new NewsDaoImpl();
		News get = news.idquery(news_Id);
		request.setAttribute("news_Id", get);

		NewstypeDao news1 = new NewstypeDaoImpl();
		List<Newstype> get1 = news1.getAllNewstype();
		request.setAttribute("news_type", get1);

		request.getRequestDispatcher("/newsxiangqi.jsp").forward(request,
				response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

	}

}
