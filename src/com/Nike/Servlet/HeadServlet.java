package com.Nike.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.BannerDao;
import com.Nike.Dao.CompanyDao;
import com.Nike.DaoImpl.BannerDaoImpl;
import com.Nike.DaoImpl.CompanyDaoImpl;
import com.Nike.entity.Banner;
import com.Nike.entity.Company;

public class HeadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		CompanyDao cmp=new CompanyDaoImpl();
		Company c=cmp.getAllCompany();
		request.setAttribute("c", c);
		
		
		
		
		
		request.getRequestDispatcher("/head.jsp").include(request,response);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	 
	}

}
