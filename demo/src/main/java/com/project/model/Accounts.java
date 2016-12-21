package com.project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Accounts {
	@Id
	@GeneratedValue
	private long id;
	private String username;
	private String password;

	public Customer getUser() {
		return user;
	}

	public void setUser(Customer user) {
		this.user = user;
	}

	@OneToOne
	private Paymentinfo payment;
	@OneToMany
	private List<Orders> orders;
	@OneToOne
	private Customer user;

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Paymentinfo getPayment() {
		return payment;
	}

	public void setPayment(Paymentinfo payment) {
		this.payment = payment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
