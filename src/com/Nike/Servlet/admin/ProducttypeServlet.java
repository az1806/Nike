package com.Nike.Servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.ProducttypeDao;
import com.Nike.DaoImpl.ProducttypeDaoImpl;
import com.Nike.entity.Product;
import com.Nike.entity.Producttype;

public class ProducttypeServlet extends BaseServlet {
	ProducttypeDao ptDao = new ProducttypeDaoImpl();
	public void getAllProducttype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			List<Producttype> ptlist = ptDao.getAllProducttype();
			request.setAttribute("ptlist", ptlist);
			request.getRequestDispatcher("product-type.jsp").forward(request, response);
	}
	
	public void addtype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type_Name = request.getParameter("type_Name");
		int n = ptDao.addProducttype(type_Name);
		if(n>0){
			List<Producttype> ptlist = ptDao.getAllProducttype();
			request.setAttribute("ptlist", ptlist);
			request.getRequestDispatcher("product-type.jsp").forward(request, response);
		}
	}

	
}
