package com.test.testApplication.dto;



public class StudentDto {
	
	private long id;
	
	private String Firstname;
	
   private String Lastname;
	
	private String email;
	
	private String password;
	
	
	public StudentDto(long id, String firstname, String lastname, String email, String password) {
		super();
		this.id = id;
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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


public StudentDto() {
	
}

}