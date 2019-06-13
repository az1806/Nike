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

public class newstypeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		NewstypeDao news = new NewstypeDaoImpl();
		List<Newstype> get = news.getAllNewstype();
		request.setAttribute("type", get);

		int news_type;
		if (request.getParameter("news_type") == null) {
			news_type = get.get(0).getType_Id();

		} else {
			news_type = Integer.parseInt(request.getParameter("news_type"));

		}
		NewsDao news1 = new NewsDaoImpl();
		List<News> get1 = news1.typequery(news_type);
		request.setAttribute("news_type", get1);

		request.getRequestDispatcher("newstype.jsp").forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
