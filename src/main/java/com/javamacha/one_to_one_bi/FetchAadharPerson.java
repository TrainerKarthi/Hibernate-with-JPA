package com.javamacha.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchAadharPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Aadhar aadhar = entityManager.find(Aadhar.class, 101);

		System.out.println(aadhar.getAadharNum());
		System.out.println(aadhar.getPerson().getName());
	}

}
