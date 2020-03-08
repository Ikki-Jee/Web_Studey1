package com.sitech.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sitech.dao.UserDao;
import com.sitech.dao.impl.UserDaoImpl;

/**
 * 处理Ajax请求的servlet
 * Servlet implementation class CheckUsernameServlet
 */
@WebServlet("/CheckUsernameServlet")
public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		UserDao userDao = new UserDaoImpl();
		boolean flag = userDao.checkUsername(username);
		
		response.setContentType("text/html;charset=UTF-8");
//		System.out.println(flag);
		if(flag) {
			response.getWriter().write("<font color ='red'><b>用户名已存在</b></font>");
		}else {
			response.getWriter().write("<font color ='green'>用户名可用! </font>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
