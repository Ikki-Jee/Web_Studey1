package com.sitech.test;

import org.junit.jupiter.api.Test;

import com.sitech.bean.User;
import com.sitech.dao.UserDao;
import com.sitech.dao.impl.UserDaoImpl;

class UserDaoTest {
	UserDao userDao = new UserDaoImpl();
//	@Test
//	void testCheckUserNameAndPassword() {
//		User user = userDao.checkUserNameAndPassword("admin", "1234");
//		System.out.println(user);
//	}
	
//	@Test
//	void testCheckUsername() {
//		
//		boolean flag = userDao.checkUsername("adfgin");
//		System.out.println(flag);
//	}
	
	@Test
	void testSaveUser() {
		
		userDao.saveUser("ssssss","ssssss","sss@sss.com");
		
	}
	
}
