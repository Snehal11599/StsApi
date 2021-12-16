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
@Data
public class Student {
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




	
	
	
	
}

