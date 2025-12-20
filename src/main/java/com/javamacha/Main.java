package com.javamacha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
//		Helps to create EntityManagerFactory Object 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
//		Helps to perform crud operations
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
//		Helps to manage the transactions.  (Only used when any modification is present in the table)
		EntityTransaction transaction = entityManager.getTransaction();
		
		Employee emp = new Employee();
		emp.setName("Developer");
		emp.setAge(1000);
		emp.setMobile(9876543145l);
		
		Employee emp1 = new Employee();
		emp1.setName("Tester");
		emp1.setAge(500);
		emp1.setMobile(34567893231l);
		
		Employee emp2 = new Employee();
		emp2.setName("HR");
		emp2.setAge(10);
		emp2.setMobile(87654567822l);
		
		Employee emp3 = new Employee();
		emp3.setName("Master");
		emp3.setAge(10000);
		emp3.setMobile(78987654522L);
		
		transaction.begin();
		entityManager.persist(emp);//helps to save the data into table
		entityManager.persist(emp1);//helps to save the data into table
		entityManager.persist(emp2);//helps to save the data into table
		entityManager.persist(emp3);//helps to save the data into table
		transaction.commit();
		
		System.out.println("Table creation done :)");
	}

}
