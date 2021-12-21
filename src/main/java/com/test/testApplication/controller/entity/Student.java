package com.test.testApplication.controller.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student")

public class Student {
public Student(Long id, String firstname, String lastname, String email, String password) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		this.email = email;
		this.password = password;
	}

@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Long id;

@Column(name = "Firstname")
private String Firstname;

@Column(name = "Lastname")
private String Lastname;

@Column(name = "email")
private String email;

@Column(name = "password")
private String password;


public Student() {
	
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getFirstname() {
	return Firstname;
}


public void setFirstname(String firstname) {
	Firstname = firstname;
}


public String getLastname() {
	return Lastname;
}


public void setLastname(String lastname) {
	Lastname = lastname;
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

