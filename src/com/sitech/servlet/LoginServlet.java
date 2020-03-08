package com.sitech.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sitech.bean.User;
import com.sitech.dao.UserDao;
import com.sitech.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDao userDao = new UserDaoImpl();
		User user = userDao.checkUserNameAndPassword(username, password);
		if (null!=user) {
			response.sendRedirect("pages/test.jsp");
		}
		else {
			request.setAttribute("msg", "用户名或密码不正确！");
			request.getRequestDispatcher("pages/login.jsp").forward(request, response);
		}

	}

}
