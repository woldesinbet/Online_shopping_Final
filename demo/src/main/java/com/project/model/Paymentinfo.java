package com.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity

public class Paymentinfo {
	@Id
	@GeneratedValue
	private long id;
	private Date payment;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getPayment() {
		return payment;
	}
	public void setPayment(Date payment) {
		this.payment = payment;
	}
	

}
