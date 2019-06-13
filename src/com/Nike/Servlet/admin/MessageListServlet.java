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

	public void seachMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String state = java.net.URLDecoder.decode(request.getParameter("state"), "utf-8");
		List<Message> n = mDao.seachMessage(state);
		request.setAttribute("mlist", n);
		request.getRequestDispatcher("messagelist.jsp").forward(request, response);
	}
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
	public void getMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("Id"));
		Message mlist = mDao.getMessageById(id);
		request.setAttribute("mlist", mlist);
		request.getRequestDispatcher("message-update.jsp").forward(request, response);
	}
	public void updateMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String state = java.net.URLDecoder.decode(request.getParameter("mstate"),  "utf-8");
		int n = mDao.updateMessageById(id, state);
		if(n>0){
			List<Message> mlist = mDao.getAllMessage();
			request.setAttribute("mlist", mlist);
			request.getRequestDispatcher("messagelist.jsp").forward(request, response);
	}
	}
}
