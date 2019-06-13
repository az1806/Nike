package com.Nike.Servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.DesignerDao;
import com.Nike.DaoImpl.DesignerDaoImpl;
import com.Nike.entity.Designer;
import com.Nike.entity.Product;

public class DesignerlistServlet extends BaseServlet {
		DesignerDao dsDao = new DesignerDaoImpl();
	public void getAllDesigner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			List<Designer> delist = dsDao.getAllDesigner();
			request.setAttribute("delist", delist);
			request.getRequestDispatcher("member-list.jsp").forward(request, response);
	}
	public void adddesigner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String Name = java.net.URLDecoder.decode(request.getParameter("Name"),"utf-8");
			String Sex = java.net.URLDecoder.decode(request.getParameter("Sex"),"utf-8");
			String About = java.net.URLDecoder.decode(request.getParameter("About"),"utf-8");
			String Pic = java.net.URLDecoder.decode(request.getParameter("Pic"),"utf-8");
			int n = dsDao.addDesigner(Name, Sex, About, Pic);
			if(n>0){
				List<Designer> delist = dsDao.getAllDesigner();
				request.setAttribute("delist", delist);
				request.getRequestDispatcher("member-list.jsp").forward(request, response);
			}
	}
	
	public void deletDesigner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int designer_Id = Integer.parseInt(request.getParameter("designer_Id"));
			int n = dsDao.deletDesignerById(designer_Id);
			if(n>0){
				List<Designer> delist = dsDao.getAllDesigner();
				request.setAttribute("delist", delist);
				request.getRequestDispatcher("member-list.jsp").forward(request, response);
			}
	}
	public void updateDesigner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("designer_Id"));
		Designer delist = dsDao.updateDesignerById(id);
		request.setAttribute("delist", delist);
		request.getRequestDispatcher("designer-update.jsp").forward(request, response);
		
	}
	public void updatesDesigner(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int designer_Id = Integer.parseInt(request.getParameter("id"));
		String designer_Name = java.net.URLDecoder.decode(request.getParameter("dname"),  "utf-8");
		String designer_Sex = java.net.URLDecoder.decode(request.getParameter("sex"), "utf-8");
		String designer_About = java.net.URLDecoder.decode(request.getParameter("con"), "utf-8");
		String designer_Pic = java.net.URLDecoder.decode(request.getParameter("pic"), "utf-8");
		int n = dsDao.updatesDesignerById(designer_Id, designer_Name, designer_Sex, designer_About, designer_Pic);
		if(n>0){
			List<Designer> delist = dsDao.getAllDesigner();
			request.setAttribute("delist", delist);
			request.getRequestDispatcher("member-list.jsp").forward(request, response);
		}
		
	}
}
