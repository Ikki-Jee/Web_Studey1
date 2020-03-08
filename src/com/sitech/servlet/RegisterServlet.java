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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("emailaddress");
		UserDao userDao = new UserDaoImpl();
		boolean flag = userDao.checkUsername(username);
		if (!flag) {
			userDao.saveUser(username,password,email);
			response.sendRedirect("http://"+request.getServerName()+":8080/Web_jQuery/pages/login.jsp");
		}
		else {
			request.setAttribute("msg", "用户名不可用！");
			request.getRequestDispatcher("pages/register.jsp").forward(request, response);
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
