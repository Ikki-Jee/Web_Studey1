package com.sitech.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sitech.bean.User;
import com.sitech.dao.UserDao;
import com.sitech.dao.impl.UserDaoImpl;

/**
 * Servlet implementation class GetUsersServlet
 */
@WebServlet("/GetUsersServlet")
public class GetUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDaoImpl();
		List<User> users = userDao.getUsers();
//		request.setAttribute("users", users);
//		request.getRequestDispatcher("pages/test.jsp").forward(request, response);
		HttpSession session = request.getSession();
		session.setAttribute("users", users);
		response.sendRedirect("pages/test.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}