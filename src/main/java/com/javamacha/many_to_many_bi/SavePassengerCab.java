package com.javamacha.many_to_many_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePassengerCab {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		
		Passenger prasad = new Passenger(1,"prasad");
		Passenger venu = new Passenger(2,"venu");
		Passenger balaji = new Passenger(3,"balaji");
		
		
		Cab bugati = new Cab(101,"bugati");
		Cab rollsRoyce = new Cab(102,"rollsRoyce");
		Cab porsche = new Cab(103,"porsche");
		Cab lamborghini = new Cab(104,"lamborghini");
		Cab benze = new Cab(105,"benze");
		
		
//		Cabs List for Prasad
		List<Cab> prasadCabs = new ArrayList<Cab>();
		prasadCabs.add(bugati);
		prasadCabs.add(porsche);
		prasadCabs.add(lamborghini);
		
//		Cabs List for Venu
		List<Cab> venuCabs = new ArrayList<Cab>();
		venuCabs.add(rollsRoyce);
		venuCabs.add(lamborghini);
		venuCabs.add(benze);
		
		
//		Cabs list for Balaji
		List<Cab> balajiCabs = new ArrayList<Cab>();
		balajiCabs.add(bugati);
		balajiCabs.add(rollsRoyce);
		balajiCabs.add(lamborghini);
		balajiCabs.add(benze);
		
//		Passengers list for Bugati
		List<Passenger> bugatiPassengers = new ArrayList<Passenger>();
		bugatiPassengers.add(prasad);
		bugatiPassengers.add(balaji);
		
//		Passengers list for Rolls Royse
		List<Passenger> rollsRoysePassengers = new ArrayList<Passenger>();
		rollsRoysePassengers.add(venu);
		rollsRoysePassengers.add(balaji);
		
//		Passengers list for Porscha
		List<Passenger> porshaPassengers = new ArrayList<Passenger>();
		porshaPassengers.add(prasad);
		
//		Passengers list for Lamborgini
		List<Passenger> lamborghiniPassengers = new ArrayList<Passenger>();
		lamborghiniPassengers.add(prasad);
		lamborghiniPassengers.add(venu);
		lamborghiniPassengers.add(balaji);

//		Passengers list for Benze
		List<Passenger> benzePassengers = new ArrayList<Passenger>();
		benzePassengers.add(venu);
		benzePassengers.add(balaji);
		
		
//		Set Passengers to their cabs
		prasad.setCabs(prasadCabs);
		venu.setCabs(venuCabs);
		balaji.setCabs(balajiCabs);
		
//		Set Cabs to their Passengers
		bugati.setPassengers(bugatiPassengers);
		rollsRoyce.setPassengers(rollsRoysePassengers);
		porsche.setPassengers(porshaPassengers);
		lamborghini.setPassengers(lamborghiniPassengers);
		benze.setPassengers(benzePassengers);
		
		
		transaction.begin();
		entityManager.persist(prasad);
		entityManager.persist(venu);
		entityManager.persist(balaji);
		
		transaction.commit();
		
	}

}
