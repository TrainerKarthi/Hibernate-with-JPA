package com.javamacha.many_to_many_uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentCourse {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
//		Student Data
		Student inky = new Student(1,"Inky",20);
		Student pinky = new Student(2,"Pinky",21);
		Student ponky = new Student(3,"Ponky",22);
		
		
//		Course Data
		Course html = new Course(101,"HTML",10000);
		Course css = new Course(102,"CSS",5000);
		Course js = new Course(103,"JS",15000);
		Course java = new Course(104,"Java",20000);
		Course python = new Course(105,"PYTHON",20000);
		Course react = new Course(106,"REACT",19000);
		Course devops = new Course(107,"DEVOPS",15000);
		
//		inky Courses
		List<Course> inkyCourses = new ArrayList<Course>();
		inkyCourses.add(html);
		inkyCourses.add(css);
		inkyCourses.add(js);
		inkyCourses.add(react);
		
//		Pinky Courses
		List<Course> pinkyCourses = new ArrayList<Course>();
		pinkyCourses.add(html);
		pinkyCourses.add(css);
		pinkyCourses.add(js);
		pinkyCourses.add(java);
		
//		Ponky courses
		List<Course> ponkyCourses = new ArrayList<Course>();
		ponkyCourses.add(js);
		ponkyCourses.add(java);
		ponkyCourses.add(python);
		ponkyCourses.add(devops);
		
//		MTM mapping
		inky.setCourses(inkyCourses);
		pinky.setCourses(pinkyCourses);
		ponky.setCourses(ponkyCourses);
		
		transaction.begin();
		entityManager.persist(inky);
		entityManager.persist(pinky);
		entityManager.persist(ponky);
		entityManager.persist(html);
		entityManager.persist(css);
		entityManager.persist(js);
		entityManager.persist(java);
		entityManager.persist(python);
		entityManager.persist(react);
		entityManager.persist(devops);
		transaction.commit();
		

	}

}
