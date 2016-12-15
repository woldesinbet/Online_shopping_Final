package com.project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
///
public class Customer {
@Id
@GeneratedValue
private long id;
private String firstname;
private String lastname;

@OneToOne
private Accounts account;
@OneToMany
private List <Address> assignedAddress;

public Accounts getAccount() {
	return account;
}
public void setAccount(Accounts account) {
	this.account = account;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

public List<Address> getAssignedAddress() {
	return assignedAddress;
}
public void setAssignedAddress(List<Address> assignedAddress) {
	this.assignedAddress = assignedAddress;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastlame() {
	return lastname;
}
public void setLastlame(String lastlame) {
	this.lastname = lastlame;
}

}
