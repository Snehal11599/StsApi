package com.test.testApplication.dto;

import org.springframework.http.HttpStatus;


public class TestResponse<T> {

	HttpStatus httpsStatus;
	String statusCode;
	String message;
	T data;
	
	public HttpStatus getHttpsStatus() {
		return httpsStatus;
	}
	public void setHttpsStatus(HttpStatus httpsStatus) {
		this.httpsStatus = httpsStatus;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	}


