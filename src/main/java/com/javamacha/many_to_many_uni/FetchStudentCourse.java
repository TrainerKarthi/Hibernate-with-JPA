package com.javamacha.many_to_many_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchStudentCourse {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Student student = entityManager.find(Student.class, 3);
		
		System.out.println(student.getName());
		
		List<Course> courses = student.getCourses();
		
		courses.stream().forEach(e -> System.out.println(e.getName()));
	}

}
