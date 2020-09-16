package com.bulkupload.entity;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UsersTest {

	public static void main(String[] args) {
		Users users = new Users();
		users.setUemail("faizshiraji@gmail.com");
		users.setFirstname("Md. Faiz");
		users.setLastname("Shiraji");
		users.setPassword("Shiraji");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BulkUpload");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(users);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("A Users object was persisted");
	}

}
