package com.javamacha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletingAnObject {
	public static void main(String[] args) {
		
//		Helps to create EntityManagerFactory Object 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
//		Helps to perform crud operations
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		Helps to manage the transactions.  (Only used when any modification is present in the table)
		EntityTransaction transaction = entityManager.getTransaction();
		
		Employee emp = entityManager.find(Employee.class, 2);		
		
		transaction.begin();
		entityManager.remove(emp);
		transaction.commit();
		
		
		System.out.println("Data deleted :(");
		
	}

}
