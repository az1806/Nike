package com.Nike.Servlet.admin;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Dao.MessageDao;
import com.Nike.DaoImpl.MessageDaoImpl;
import com.Nike.entity.Message;

public class MessageListServlet extends BaseServlet {
		MessageDao mDao = new MessageDaoImpl();
	public void getAllMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Message> mlist = mDao.getAllMessage();
		request.setAttribute("mlist", mlist);
		request.getRequestDispatcher("messagelist.jsp").forward(request, response);
	}

	/*public void addMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mName = java.net.URLDecoder.decode(request.getParameter("mName"), "utf-8");
		String mPhone = java.net.URLDecoder.decode(request.getParameter("mPhone"), "utf-8");
		String mEmial = java.net.URLDecoder.decode(request.getParameter("mEmial"), "utf-8");
		String mContent = java.net.URLDecoder.decode(request.getParameter("mContent"), "utf-8");
		String mstate = java.net.URLDecoder.decode(request.getParameter("mstate"), "utf-8");
		int n = mDao.addMessage(mName, mPhone, mEmial, mContent,mstate);
		if(n>0){
			List<Message> mlist = mDao.getAllMessage();
			request.setAttribute("mlist", mlist);
			request.getRequestDispatcher("messagelist.jsp").forward(request, response);
		}
	}*/
	public void deletMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int Id = Integer.parseInt(request.getParameter("Id"));
		int n = mDao.deleteMessageById(Id);
		if(n>0){
			List<Message> mlist = mDao.getAllMessage();
			request.setAttribute("mlist", mlist);
			request.getRequestDispatcher("messagelist.jsp").forward(request, response);
		}
	}
}
