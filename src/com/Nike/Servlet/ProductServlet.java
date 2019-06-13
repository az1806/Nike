package com.Nike.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.ProductDao;
import com.Nike.DaoImpl.ProductDaoImpl;
import com.Nike.entity.Product;


public class ProductServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductDao pDao = new ProductDaoImpl();
		List<Product> list = pDao.getAllProduct();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/product.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
