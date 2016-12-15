package com.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class ShoppingCart {
	@Id
	@GeneratedValue
	private long id;
	private int quantity;
	private Date dateCreated;
	@OneToMany
	private List<Product> holdsproducts;
	public List<Product> getHoldsproducts() {
		return holdsproducts;
	}
	public void setHoldsproducts(List<Product> holdsproducts) {
		this.holdsproducts = holdsproducts;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	

}
