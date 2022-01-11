package com.test.testApplication.dto;

import javax.persistence.Column;

public class StudentDto {
	
	private Long sid;

	public StudentDto(Long sid, String firstname, String lastname, String email, String password) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}
	
	public StudentDto() {
		
	}

	private String firstname;

	private String lastname;

	private String email;

	private String password;

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
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