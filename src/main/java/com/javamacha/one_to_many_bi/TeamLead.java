package com.javamacha.one_to_many_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class TeamLead {
	
	@Id
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "teamLead")
	private List<Developer> developers;
	
	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
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
