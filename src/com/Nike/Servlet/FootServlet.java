package com.Nike.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.CompanyDao;
import com.Nike.DaoImpl.CompanyDaoImpl;
import com.Nike.entity.Company;

public class FootServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");//设置输出内容的编码格式
		request.setCharacterEncoding("UTF-8");//设置输出内容的编码格式
		
		CompanyDao cmp=new CompanyDaoImpl();
		Company c=cmp.getAllCompany();
		request.setAttribute("c", c);
		
		
		request.getRequestDispatcher("foot.jsp").include(request, response);
	}


}
