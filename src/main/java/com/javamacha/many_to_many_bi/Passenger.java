package com.javamacha.many_to_many_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Passenger {
	
	@Id
	private int id;
	
	private String name;
	
	@ManyToMany
	@JoinTable
	private List<Cab> cabs;
	
	public Passenger() {
		super();
	}

	public Passenger(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public List<Cab> getCabs() {
		return cabs;
	}

	public void setCabs(List<Cab> cabs) {
		this.cabs = cabs;
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
	
	

}
