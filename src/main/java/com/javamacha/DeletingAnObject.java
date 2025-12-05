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
		
//		Employee employee = entityManager.find(Employee.class, 2);
		
//		entityManager.
		Employee emp = new Employee();
		emp.setId(901);
		emp.setName("Hr120");
		emp.setAge(10);
		
		
		transaction.begin();
		
		transaction.commit();
		
		
		System.out.println("Data deleted :(");
		
	}

}
