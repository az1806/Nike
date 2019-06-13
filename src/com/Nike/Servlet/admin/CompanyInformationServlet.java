package com.Nike.Servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.CompanyDao;
import com.Nike.DaoImpl.CompanyDaoImpl;
import com.Nike.entity.Company;

public class CompanyInformationServlet extends BaseServlet {
			CompanyDao cDao = new CompanyDaoImpl();
	public void getAllCompany(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			Company com = cDao.getAllCompany(); 
			request.setAttribute("com", com);
			request.getRequestDispatcher("company.jsp").forward(request, response);	
	}
//	public void updateCompany(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//			int id = Integer.parseInt(request.getParameter("Company_Id")); 
//			Company com = cDao.updateCompanyById(id); 
//			request.setAttribute("com", com);
//			request.getRequestDispatcher("company.jsp").forward(request, response);	
//	}
	public void updatesCompany(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int cid = Integer.parseInt(request.getParameter("cid")); 
			String cname = java.net.URLDecoder.decode(request.getParameter("cname"),  "utf-8");
			String cphone = java.net.URLDecoder.decode(request.getParameter("cphone"),  "utf-8");
			String cemial = java.net.URLDecoder.decode(request.getParameter("cemial"),  "utf-8");
			String caddress = java.net.URLDecoder.decode(request.getParameter("caddress"),  "utf-8");
			String cprofile = java.net.URLDecoder.decode(request.getParameter("cprofile"),  "utf-8");
			String cculture = java.net.URLDecoder.decode(request.getParameter("cculture"),  "utf-8");
			String cbusiness = java.net.URLDecoder.decode(request.getParameter("cbusiness"),  "utf-8");
			String cofficial = java.net.URLDecoder.decode(request.getParameter("cofficial"),  "utf-8");
			String cpic = java.net.URLDecoder.decode(request.getParameter("cpic"),  "utf-8");
			int n = cDao.updatesCompanyById(cid, cname, cphone, cemial, caddress, cprofile, cculture, cbusiness, cofficial, cpic);
			System.out.println(n);
			if(n>0){
				Company com = cDao.getAllCompany(); 
				request.setAttribute("com", com);
				request.getRequestDispatcher("company.jsp").forward(request, response);	
			}
	}

}
