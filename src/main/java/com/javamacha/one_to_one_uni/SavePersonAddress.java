package com.javamacha.one_to_one_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAddress {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setId(2);
		person.setName("Ramana");
		person.setAge(150);
		person.setMobile(976543219l);
		
		Address address = new Address();
		address.setId(102);
		address.setCountry("INDIA");
		address.setState("TAMILNADU");
		
		person.setAddress(address);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(address);
		entityTransaction.commit();
		
		
		
		
		
		
	}

}
