package com.javamacha.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAadhar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
	
		Person person = new Person();
		person.setId(1);
		person.setName("Karthik");
		
		Aadhar aadhar = new Aadhar();
		aadhar.setId(101);
		aadhar.setAadharNum(987654321234l);
		aadhar.setAddress("chittoor");
		
		person.setAadhar(aadhar);
		aadhar.setPerson(person);
		
		transaction.begin();
		entityManager.persist(person);
		entityManager.persist(aadhar);
		transaction.commit();
	}
}
