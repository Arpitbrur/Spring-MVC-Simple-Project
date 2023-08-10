package com.jsp.Spring_mvc_project_1pm.service;

import com.jsp.Spring_mvc_project_1pm.dao.UserDao;
import com.jsp.Spring_mvc_project_1pm.dto.User;

public class UserService {

	UserDao dao = new UserDao();
	
	// insert method----------------------------------------------------------------------------
	public User insertUser(User user) {
	return dao.insertUser(user);

	}

}