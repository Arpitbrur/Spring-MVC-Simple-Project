package com.jsp.Spring_mvc_project_1pm.dao;

import java.util.List;

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
		try {
			if(!(entityTransaction.isActive())) {
				entityTransaction.begin();
				entityManager.persist(user);
				entityTransaction.commit();
			}
		}catch (Exception e) {
			// TODO: handle exception
			entityTransaction.rollback();
		}
		return user;
	}
	
	// display-----------------------------------------------------------------------------------
	@SuppressWarnings("unchecked")
	public List<User> getAllDisplay(){
		return entityManager.createQuery("From User").getResultList();
	}
	
	// delete method---------------------------------------------------------------------------
//	public void deleteUser(int id) {
//		entityTransaction.begin();
//		entityManager.remove(entityManager);
//	}
}
