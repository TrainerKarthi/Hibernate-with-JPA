package com.javamacha.many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentTeacher {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		
		Teacher lavan = new Teacher();
		lavan.setId(1);
		lavan.setName("LAVAN");
		lavan.setSubject("JAVA");
		
		Student inky = new Student();
		inky.setId(101);
		inky.setName("INKY");
		inky.setMarks(50);
		
		Student pinky = new Student();
		pinky.setId(102);
		pinky.setName("PINKY");
		pinky.setMarks(100);
		
		Student ponky = new Student();
		ponky.setId(103);
		ponky.setName("PONKY");
		ponky.setMarks(99);
		
		
		inky.setTeacher(lavan);
		pinky.setTeacher(lavan);
		ponky.setTeacher(lavan);
		
		
		transaction.begin();
		entityManager.persist(lavan);
		entityManager.persist(inky);
		entityManager.persist(pinky);
		entityManager.persist(ponky);
		transaction.commit();
		
		
		
		
	
		
		
	}

}
