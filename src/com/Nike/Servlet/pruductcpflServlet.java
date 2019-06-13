package com.Nike.Servlet;

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

public class pruductcpflServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");// 设置输出内容的编码格式
		request.setCharacterEncoding("UTF-8");// 设置输出内容的编码格式

		ProducttypeDao cmp = new ProducttypeDaoImpl();
		List<Producttype> c = cmp.getAllProducttype();
		request.setAttribute("c", c);

		// 根据分类查询商品//
		int type_Id;
		if (request.getParameter("type_Id") == null) {
			type_Id = c.get(0).getType_Id();

		} else {
			type_Id = Integer.parseInt(request.getParameter("type_Id"));

		}
		ProductDao cmp1 = new ProductDaoImpl();
		List<Product> c1 = cmp1.typequery(type_Id);
		request.setAttribute("c1", c1);
		request.getRequestDispatcher("productcpfl.jsp").include(request,
				response);

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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
