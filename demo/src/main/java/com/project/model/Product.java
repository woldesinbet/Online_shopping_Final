package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private long productid;
	private String name;
	private float price;
	private String desribtion;

	@OneToOne
	private Category assignedcategory;

	public Category getAssignedcategory() {
		return assignedcategory;
	}

	public void setAssignedcategory(Category assignedcategory) {
		this.assignedcategory = assignedcategory;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDesribtion() {
		return desribtion;
	}

	public void setDesribtion(String desribtion) {
		this.desribtion = desribtion;
	}

}
