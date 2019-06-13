package com.Nike.Servlet.admin;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.ProductDao;
import com.Nike.Dao.ProducttypeDao;
import com.Nike.DaoImpl.ProductDaoImpl;
import com.Nike.DaoImpl.ProducttypeDaoImpl;
import com.Nike.entity.Product;
import com.Nike.entity.Producttype;

public class ProductListServlet extends BaseServlet {
	ProductDao pDao = new ProductDaoImpl();
	ProducttypeDao ptDao = new ProducttypeDaoImpl();
	public void getAllProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Product> list = pDao.getAllProduct();
		request.setAttribute("list", list);
		List<Producttype> ptlist = ptDao.getAllProducttype();
		request.setAttribute("ptlist", ptlist);
		request.getRequestDispatcher("productlist.jsp").forward(request, response);
	}
	public void addProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pname = java.net.URLDecoder.decode(request.getParameter("pname"),  "utf-8");
		String type_Id = java.net.URLDecoder.decode(request.getParameter("type_Id"), "utf-8");
		double pprice = Double.parseDouble(request.getParameter("pprice"));
		String pcontent = java.net.URLDecoder.decode(request.getParameter("pcontent"), "utf-8");
		String ppic = java.net.URLDecoder.decode(request.getParameter("ppic"), "utf-8");
		int n = pDao.addProduct(pname, type_Id, pprice, pcontent, ppic);
		if(n>0){
			List<Product> list = pDao.getAllProduct();
			request.setAttribute("list", list);
			request.getRequestDispatcher("productlist.jsp").forward(request, response);
		}
		
	}
	public void deletProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int Product_Id = Integer.parseInt(request.getParameter("Product_Id"));
		int n = pDao.deleteProductById(Product_Id);
		if(n>0){
			List<Product> list = pDao.getAllProduct();
			request.setAttribute("list", list);
			request.getRequestDispatcher("productlist.jsp").forward(request, response);
		}
	}
	public void updateProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("Product_Id"));
		Product list = pDao.updateProductById(id);
		request.setAttribute("list", list);
		request.getRequestDispatcher("product-update.jsp").forward(request, response);
		
	}
	public void updatesProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = java.net.URLDecoder.decode(request.getParameter("username"),  "utf-8");
		String type = java.net.URLDecoder.decode(request.getParameter("type"), "utf-8");
		double price = Double.parseDouble(request.getParameter("price"));
		String con = java.net.URLDecoder.decode(request.getParameter("con"), "utf-8");
		String pic = java.net.URLDecoder.decode(request.getParameter("pic"), "utf-8");
		int n = pDao.updatesProductById(id,name,type,price,con,pic);
		if(n>0){
			List<Product> list = pDao.getAllProduct();
			request.setAttribute("list", list);
			request.getRequestDispatcher("productlist.jsp").forward(request, response);
		}
		
	}
	
	
	public void chaxunpro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int tid = Integer.parseInt(request.getParameter("tid"));
		String proname = java.net.URLDecoder.decode(request.getParameter("proname"),  "utf-8");
		String procon = java.net.URLDecoder.decode(request.getParameter("procon"), "utf-8");
		List<Product> list = pDao.chaxunpro(tid, proname, procon);
			request.setAttribute("list", list);
			request.getRequestDispatcher("productlist.jsp").forward(request, response);
		}
		
	}

