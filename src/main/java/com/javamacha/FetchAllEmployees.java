package com.javamacha;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllEmployees {

	public static void main(String[] args) {
		//HQL Queries -> Hibernate Query Language.
		//we use this for fetching the data.
		
		// SQL -> SELECT * FROM Employee;
		// HQL -> SELECT e FROM Employee e;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Query query = entityManager.createQuery("SELECT e FROM Employee e");
		
		List<Employee> list = query.getResultList();
		
		list.stream().forEach(System.out::println);
		
	}
}
