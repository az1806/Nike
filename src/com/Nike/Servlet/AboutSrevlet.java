package com.Nike.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.CompanyDao;
import com.Nike.Dao.DesignerDao;
import com.Nike.DaoImpl.CompanyDaoImpl;
import com.Nike.DaoImpl.DesignerDaoImpl;
import com.Nike.entity.Company;
import com.Nike.entity.Designer;

public class AboutSrevlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CompanyDao cmp1=new CompanyDaoImpl();
		Company com=cmp1.getAllCompany();
		request.setAttribute("company", com);
		
		CompanyDao cmp=new CompanyDaoImpl();
		Company c=cmp.getAllCompany();
		request.setAttribute("c", c);
		
		
		DesignerDao cmp2=new DesignerDaoImpl();
		List<Designer> c2=cmp2.getAllDesigner();
		request.setAttribute("c2", c2);
		request.getRequestDispatcher("/about.jsp").forward(request,response);
	
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
