package com.Nike.Servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.Nike.Dao.UserDao;
import com.Nike.DaoImpl.UserDaoImpl;
import com.Nike.Util.Result;
import com.Nike.entity.User;

public class LoginServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
	     PrintWriter out=response.getWriter();
	     UserDao uDao=new UserDaoImpl();
	     String username=request.getParameter("name");
	     System.out.println(username);
	     String password=request.getParameter("password");
	     User user=uDao.login(username, password);
	     System.out.println(user);
	     if(user!=null){
	    	 HttpSession session = request.getSession();
	    	 session.setAttribute("user",user);
	    	 request.getRequestDispatcher("/admin/index.jsp").forward(request, response);
	     }else{
	    	 response.sendRedirect("/admin/login.jsp");  
	     }	
		}
	}



