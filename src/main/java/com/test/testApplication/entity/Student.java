package com.test.testApplication.entity;

import java.util.stream.Stream;

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

@Column(name = "firstname")
private String firstname;

@Column(name = "lastname")
private String lastname;

@Column(name = "email")
private String email;

@Column(name = "password")
private String password;

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
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

public Student(Long id, String firstname, String lastname, String email, String password) {
super();
this.id = id;
this.firstname = firstname;
this.lastname = lastname;
this.email = email;
this.password = password;
}

public Student() {

}

public Stream<Student> stream() {
	// TODO Auto-generated method stub
	return null;
}


}