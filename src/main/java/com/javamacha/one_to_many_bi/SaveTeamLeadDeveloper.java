package com.javamacha.one_to_many_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.border.EtchedBorder;

public class SaveTeamLeadDeveloper {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		TeamLead leadKarthik = new TeamLead();
		leadKarthik.setId(1);
		leadKarthik.setName("Karthik");
		
		TeamLead leadRamana = new TeamLead();
		leadRamana.setId(2);
		leadRamana.setName("Ramana");
		
		Developer developerPrasad= new Developer(101,"prasad","front-end");
		Developer developerVenu= new Developer(102,"venu","back-end");
		Developer developerLavan= new Developer(103,"lavan","front-end");
		Developer developerHarish= new Developer(104,"harish","back-end");
		Developer developerAchyuth= new Developer(105,"achyuth","front-end");

//		Developers belongs to LeadKarthik
		List<Developer> karthikTeam = new ArrayList<Developer>();
		karthikTeam.add(developerPrasad);
		karthikTeam.add(developerVenu);
		
//		Developers belongs to Lead Ramana
		List<Developer> ramanaTeam = new ArrayList<Developer>();
		ramanaTeam.add(developerLavan);
		ramanaTeam.add(developerHarish);
		ramanaTeam.add(developerAchyuth);
		
//		Teamlead havs many dev mapping
		leadKarthik.setDevelopers(karthikTeam);
		leadRamana.setDevelopers(ramanaTeam);
		
//		many Deve to teamLead mapping
		developerPrasad.setTeamLead(leadKarthik);
		developerVenu.setTeamLead(leadKarthik);
		developerLavan.setTeamLead(leadRamana);
		developerHarish.setTeamLead(leadRamana);
		developerAchyuth.setTeamLead(leadRamana);
		
		transaction.begin();
		entityManager.persist(leadKarthik);
		entityManager.persist(leadRamana);
		entityManager.persist(developerPrasad);
		entityManager.persist(developerVenu);
		entityManager.persist(developerLavan);
		entityManager.persist(developerHarish);
		entityManager.persist(developerAchyuth);
		transaction.commit();
		
	}
}
