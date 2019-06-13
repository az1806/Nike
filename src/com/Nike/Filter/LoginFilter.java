package com.Nike.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Nike.entity.User;

public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		HttpSession session = request.getSession(); //获取session
		String path = request.getRequestURI();//获取访问路径
		System.out.println(path);
		User user = (User)session.getAttribute("user");
		if(user !=null){//登陆过了
			chain.doFilter(request, response); //放行，就当作什么都没发生过
		}else if(path.equals("/NIKES/admin/login.jsp")||path.equals("/NIKES/admin/user") || path.endsWith(".css")||path.endsWith(".js")||path.endsWith(".jpg")|| path.endsWith(".png")){
			System.out.println(222);
			chain.doFilter(request, response); //放行，就当作什么都没发生过
		} else{//没有登陆
			System.out.println(111);
			response.sendRedirect("/NIKES/admin/login.jsp");
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
		
}
