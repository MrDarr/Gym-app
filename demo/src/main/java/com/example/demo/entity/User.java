package com.example.demo.entity;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

@Entity
@Table(name ="users")

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long Id;
	@Column(name="firstname")
private String firstname;
	@Column(name="lastname")
private String lastname;
	@Column(name="email")
private String email;
	@Column(name="password")
private String password;



public User(String firstname, String lastname, String email, String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
	
	
	
	
}
