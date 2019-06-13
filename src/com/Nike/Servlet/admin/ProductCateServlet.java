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

public class ProductCateServlet extends BaseServlet {
	ProducttypeDao ptDao = new ProducttypeDaoImpl();
	public void getAllProducttype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Producttype> ptlist = ptDao.getAllProducttype();
		request.setAttribute("ptlist", ptlist);
		request.getRequestDispatcher("product-type.jsp").forward(request, response);
	}
	public void addtype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type_Name = java.net.URLDecoder.decode(request.getParameter("type_Name"), "utf-8");
		int n = ptDao.addProducttype(type_Name);
		if(n>0){
			List<Producttype> ptlist = ptDao.getAllProducttype();
			request.setAttribute("ptlist", ptlist);
			request.getRequestDispatcher("product-type.jsp").forward(request, response);
		}
}
	public void deletetype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int type_Id = Integer.parseInt(request.getParameter("type_Id"));
			int n = ptDao.deletetypeById(type_Id);
			if(n>0){
			List<Producttype> ptlist = ptDao.getAllProducttype();
			request.setAttribute("ptlist", ptlist);
			request.getRequestDispatcher("product-type.jsp").forward(request, response);
		}
	}
	public void updateProducttype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("type_Id"));
		Producttype ptlist = ptDao.updateProducttypeById(id);
		request.setAttribute("ptlist", ptlist);
		request.getRequestDispatcher("producttype-update.jsp").forward(request, response);
		
	}
	public void updatesProducttype(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String tName = java.net.URLDecoder.decode(request.getParameter("tName"),  "utf-8");
		int n = ptDao.updatesProducttypeById(id,tName);
		if(n>0){
			List<Producttype> ptlist = ptDao.getAllProducttype();
			request.setAttribute("ptlist", ptlist);
			request.getRequestDispatcher("product-type.jsp").forward(request, response);
		}
	}
}
