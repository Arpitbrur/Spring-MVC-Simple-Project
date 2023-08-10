package com.jsp.Spring_mvc_project_1pm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Spring_mvc_project_1pm.dto.User;

public class UserDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("arpit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	// insert method----------------------------------------------------------------------------
	public User insertUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
		return user;
	}
}
