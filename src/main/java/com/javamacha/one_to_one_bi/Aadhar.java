package com.javamacha.one_to_one_bi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar {

	@Id
	private int id;
	
	private long aadharNum;
	
	private String address;
	
	
	@OneToOne
	private Person person;
	
	
	
	
	

	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", aadharNum=" + aadharNum + ", address=" + address + ", person=" + person + "]";
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(long aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
