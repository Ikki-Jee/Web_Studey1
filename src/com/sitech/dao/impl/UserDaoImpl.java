package com.sitech.dao.impl;

import com.sitech.bean.User;
import com.sitech.dao.BasicDao;
import com.sitech.dao.UserDao;

public class UserDaoImpl implements UserDao{

	BasicDao basicDao = new BasicDao();
	
	@Override
	public User checkUserNameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		String sql = "select id,username,password,email from users where username = ? and password =?";
		
		User user = basicDao.getBean(User.class, sql, username, password);
		return user;
	}

	@Override
	public boolean checkUsername(String username) {
		// TODO Auto-generated method stub
		String sql = "select id,username,password,email from users where username = ?";		
		User user = basicDao.getBean(User.class, sql, username);
		return user != null;
	}

	@Override
	public void saveUser(String username, String password, String email) {
		// TODO Auto-generated method stub
		String sql = "insert into users VALUES (null,?,?,?)";		
		basicDao.update(sql,username, password,email);

	}

	
	
}
