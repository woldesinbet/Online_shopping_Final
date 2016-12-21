package com.project.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue
	private long id;
	@OneToOne
	private ShoppingCart shoppingcart;
	private Date deliveryDate;
	private double totalorderprice;
	private String shippignSatus;

	@OneToOne
	private Address adress;
	@OneToMany
	private List<Orderline> lineitems;

	public ShoppingCart getShoppingcart() {
		return shoppingcart;
	}

	public void setShoppingcart(ShoppingCart shoppingcart) {
		this.shoppingcart = shoppingcart;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public List<Orderline> getLineitems() {
		return lineitems;
	}

	public void setLineitems(List<Orderline> lineitems) {
		this.lineitems = lineitems;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public double getTotalorderprice() {
		return totalorderprice;
	}

	public void setTotalorderprice(double totalorderprice) {
		this.totalorderprice = totalorderprice;
	}

	public String getShippignSatus() {
		return shippignSatus;
	}

	public void setShippignSatus(String shippignSatus) {
		this.shippignSatus = shippignSatus;
	}

}
