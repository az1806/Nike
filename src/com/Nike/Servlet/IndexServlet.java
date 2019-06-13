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
import com.Nike.Dao.ProductDao;
import com.Nike.DaoImpl.BannerDaoImpl;
import com.Nike.DaoImpl.CompanyDaoImpl;
import com.Nike.DaoImpl.ProductDaoImpl;
import com.Nike.entity.Banner;
import com.Nike.entity.Company;
import com.Nike.entity.Product;

public class IndexServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");//设置输出内容的编码格式
		request.setCharacterEncoding("UTF-8");//设置输出内容的编码格式
		
		CompanyDao cmp=new CompanyDaoImpl();
		Company c=cmp.getAllCompany();
		request.setAttribute("c", c);
		
		/*BannerDao bnd = new BannerDaoImpl();
		List<Banner> banner = bnd.getAllBanner();
		request.setAttribute("banner",banner);*/
		
		BannerDao cmp1=new BannerDaoImpl();
		List<Banner> c1=cmp1.getAllBanner();
		request.setAttribute("lunbo", c1);
		
		ProductDao comDao=new ProductDaoImpl();
		List<Product> com=comDao.liujiquery();
		request.setAttribute("suiji", com);
		
		
		
		

		request.getRequestDispatcher("index.jsp").include(request,response);
		
		
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
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
