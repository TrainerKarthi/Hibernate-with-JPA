package com.javamacha.one_to_many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchCustomerOrder {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Customer customer = entityManager.find(Customer.class, 1);
		
//		System.out.println(customer);
		
		List<Orders> orders = customer.getOrders();
		
		System.out.println(customer);
		
		orders.stream().forEach(System.out::println);
	}

}
