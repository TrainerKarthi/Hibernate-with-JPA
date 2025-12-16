package com.javamacha.one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	private int id;
	
	private String product;

	
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", product=" + product + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	
}
