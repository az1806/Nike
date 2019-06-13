package com.Nike.Servlet.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nike.Util.Result;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;


public class HTProductServlet extends BaseServlet {
	
	
	public void saveImg(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		SmartUpload smart = new SmartUpload();
		smart.setCharset("UTF-8");
		smart.initialize(getServletConfig(), request, response);
		try {
			smart.upload();
			smart.save("/images");
			String filename = smart.getFiles().getFile(0).getFileName();
			out.println(Result.toClient(true, filename));
		} catch (SmartUploadException e) {
			out.println(Result.toClient(false, e.getMessage()));
			e.printStackTrace();
		}
		}
	}



