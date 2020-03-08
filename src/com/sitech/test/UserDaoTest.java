package com.sitech.test;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.sitech.bean.User;
import com.sitech.dao.UserDao;
import com.sitech.dao.impl.UserDaoImpl;

class UserDaoTest {
	UserDao userDao = new UserDaoImpl();
	
	@Test
	void testCheckUserNameAndPassword() {
		User user = userDao.checkUserNameAndPassword("admin", "123456");
		System.out.println(user);
	}
	
	@Test
	void testCheckUsername() {
		
		boolean flag = userDao.checkUsername("adfgin");
		System.out.println(flag);
	}
	
	@Test
	void testSaveUser() {
		
		userDao.saveUser("BBBBB3","123456","BBBB3@sss.com");
		
	}
	
	@Test
	void testGetUsers() {
		
		List<User> users = userDao.getUsers();
		for(User user:users) {
			System.out.println(user);
		}
		
	}
	
	
}
