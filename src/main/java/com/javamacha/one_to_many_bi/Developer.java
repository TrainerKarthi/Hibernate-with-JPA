package com.javamacha.one_to_many_bi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Developer {

	@Id
	private int id;
	
	private String name;
	
	private String role;
	
	@ManyToOne
	private TeamLead teamLead;

	
	
	public Developer(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public TeamLead getTeamLead() {
		return teamLead;
	}


	public void setTeamLead(TeamLead teamLead) {
		this.teamLead = teamLead;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
