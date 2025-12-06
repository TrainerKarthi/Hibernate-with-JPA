package com.javamacha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UnderstandingPersistInDepth {

	public static void main(String[] args) {
		
//		Helps to create EntityManagerFactory Object 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
//		Helps to perform crud operations
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		Helps to manage the transactions.  (Only used when any modification is present in the table)
		EntityTransaction transaction = entityManager.getTransaction();
		
		Employee employee = new Employee();
		employee.setId(110);
		employee.setName("Macha");
		employee.setAge(100);
		
		transaction.begin();
		entityManager.persist(employee);//inserted and Obj is managed By Persistence API
//		employee.setAge(290);
//		employee.setName("Machi");
		transaction.commit();
		
		employee.setName("Hiiiiiii");
		
		System.out.println("Data inserted and updated");
		
		
		
	}
}
