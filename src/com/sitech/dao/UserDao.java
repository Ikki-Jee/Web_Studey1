package com.sitech.dao;

import java.util.List;

import com.sitech.bean.User;

public interface UserDao {

	User checkUserNameAndPassword(String username, String password);
	boolean checkUsername(String username);
	void saveUser(String username, String password, String email);
	List<User> getUsers();
	
}
