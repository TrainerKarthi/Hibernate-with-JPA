package com.javamacha.many_to_many_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cab {
	
	@Id
	private int id;
	
	private String cabName;
	
	@ManyToMany(mappedBy="cabs")
	private List<Passenger> passengers;

	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cab(int id, String cabName) {
		super();
		this.id = id;
		this.cabName = cabName;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCabName() {
		return cabName;
	}

	public void setCabName(String cabName) {
		this.cabName = cabName;
	}
	
	

}
