package com.javamacha.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

public class SaveCustomerOrder {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Customer karthik = new Customer();
		karthik.setId(1);
		karthik.setName("Karthik");
		karthik.setAge(200);
		karthik.setMobile(987654321l);
	
		Orders watch = new Orders();
		watch.setId(103);
		watch.setProduct("watch");
		
		Orders airPods = new Orders();
		airPods.setId(104);
		airPods.setProduct("airpods");
		
		Orders hardDisk = new Orders();
		hardDisk.setId(105);
		hardDisk.setProduct("Hard Disk");
		
		List<Orders> orders = new ArrayList<Orders>();
		orders.add(watch);
		orders.add(airPods);
		orders.add(hardDisk);
		
		karthik.setOrders(orders);
		
		transaction.begin();
		entityManager.persist(karthik);
		entityManager.persist(watch);
		entityManager.persist(airPods);
		entityManager.persist(hardDisk);
		transaction.commit();
		
	}

}
