package com.javamacha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchEmployee {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee employee = entityManager.find(Employee.class, 2);
		
		System.out.println("Employee ID: "+employee.getId());
		System.out.println("Employee Name: "+employee.getName());
		System.out.println("Employee Age: "+employee.getAge());
		
		System.out.println(employee);
		
	}

}
