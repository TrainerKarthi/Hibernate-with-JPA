package com.javamacha;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchEmployeesByAge {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String hql="SELECT e FROM Employee e WHERE e.age=:age";
		
		Query query = entityManager.createQuery(hql);
		
		query.setParameter("age", 10);
		
		List list = query.getResultList();
		
		list.stream().forEach(System.out::println);
	}
}
