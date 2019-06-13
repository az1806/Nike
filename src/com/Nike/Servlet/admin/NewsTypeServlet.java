package com.Nike.Servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.NewstypeDao;
import com.Nike.DaoImpl.NewstypeDaoImpl;
import com.Nike.entity.Newstype;

public class NewsTypeServlet extends BaseServlet {
			NewstypeDao ntDao = new NewstypeDaoImpl();
	public void getAllNewstype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			List<Newstype> nlist = ntDao.getAllNewstype();
			request.setAttribute("nlist", nlist);
			request.getRequestDispatcher("news-type.jsp").forward(request, response);
	}
	public void addNewstype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ntname = java.net.URLDecoder.decode(request.getParameter("ntname"),  "utf-8");
		int n = ntDao.addNewstype(ntname);
		if(n>0){
			List<Newstype> nlist = ntDao.getAllNewstype();
			request.setAttribute("nlist", nlist);
			request.getRequestDispatcher("news-type.jsp").forward(request, response);
		}
	}
	public void deletNewstype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("type_Id"));
			int n = ntDao.deletNewstypeById(id);
			if(n>0){
				List<Newstype> nlist = ntDao.getAllNewstype();
				request.setAttribute("nlist", nlist);
				request.getRequestDispatcher("news-type.jsp").forward(request, response);
			}
	}

}
