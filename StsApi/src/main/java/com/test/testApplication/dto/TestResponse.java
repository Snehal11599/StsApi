package com.test.testApplication.dto;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data

public class TestResponse<T> {

	HttpStatus httpsStatus;
	String statusCode;
	String message;
	T data;
	
	
	}


