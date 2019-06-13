package com.Nike.Servlet;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.MessageDao;
import com.Nike.DaoImpl.MessageDaoImpl;



public class MessageServletQian extends HttpServlet {

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
		/*request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    System.out.println("进入MessageServlet");
	    Integer id=null;
	    
	    String xingming=request.getParameter("Name");
	    String dianhua=request.getParameter("Phone");
	    String email=request.getParameter("Emial");
	    String neirong=request.getParameter("state");
	    
	    MessageDao aa= new MessageDaoImpl();
	    
	    if(aa.tianjia(id, xingming, dianhua, email, neirong)){
	    	out.println("留言成功");
	    	out.println("<a href=\"/gnc/message.jsp\">点击返回</a>");
	    }else{
	    	out.println("留言失败");
	    }*/
	 
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
		request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    System.out.println("进入MessageServlet");
	    Integer id=null;
	    
	    String Name=request.getParameter("xingming");
	    String Phone=request.getParameter("dianhua");
	    String Emial=request.getParameter("email");
	    String Content=request.getParameter("neirong");
	    
	    MessageDao aa= new MessageDaoImpl();
	    int n= aa.addMessage(Name, Phone, Emial, Content);
	    if(n>0){
	    	out.println("留言成功");
	    	out.println("<a href=\"/gnc/message.jsp\">点击返回</a>");
	    }else{
	    	out.println("留言失败");
	    }
	}

}
