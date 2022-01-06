package com.test.testApplication.controller;

import java.util.List;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.test.testApplication.dto.StudentDto;
import com.test.testApplication.dto.TestResponse;
import com.test.testApplication.service.TestService;

@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = "*",maxAge=300)

public class TestController {
	
	@Autowired
	TestService testService;

	
	//save users
	@PostMapping(value = "/save")
	public ResponseEntity<TestResponse<?>>saveUsers(@RequestBody StudentDto studentDto){
		TestResponse<StudentDto> testResponse = new TestResponse<>();
		StudentDto savedUserResponse = testService.save(studentDto);
		testResponse.setHttpsStatus (HttpStatus.OK);
		testResponse.setMessage ("saves successfully");
		testResponse.setData(savedUserResponse);
        return new ResponseEntity<>( testResponse  , HttpStatus.OK);
		
	}
	
	
	//get users
	@GetMapping("/getusers")
	public List <StudentDto> getAllStudent() {
    return this.testService.getAllStudent(); 
	}
	
	
	//delete users
	@RequestMapping("/delete/{id}")
	public ResponseEntity<TestResponse<?>> delete(@PathVariable("id") Long id)
	{
	TestResponse<StudentDto> testResponse = new TestResponse<>();
	testResponse.setMessage ("deleted successfully");
	testService.delete(id);
	  return new ResponseEntity<>( testResponse  , HttpStatus.OK);

	}
	
	
     //update users
	@PutMapping(value = "/update")
	    public ResponseEntity<TestResponse<?>>updateUsers(@RequestBody StudentDto studentDto){
		TestResponse<StudentDto> testResponse = new TestResponse<>();
		StudentDto savedUserResponse = testService.save(studentDto);
		testResponse.setHttpsStatus (HttpStatus.OK);
		testResponse.setMessage ("update successfully");
		testResponse.setData(savedUserResponse);
        return new ResponseEntity<>( testResponse  , HttpStatus.OK);
		
	}
	
	//validate email
	@PostMapping(value = "/validateEmail")
	public ResponseEntity<TestResponse<String>> Validateemail(@RequestBody StudentDto studentDto) {
	TestResponse<String> testResponse = new TestResponse<>();
	String rsponse = testService.validateEamil(studentDto.getEmail());
	testResponse.setHttpsStatus(HttpStatus.OK);
	testResponse.setMessage(rsponse);
	testResponse.setData(rsponse);
	return new ResponseEntity<>(testResponse, HttpStatus.OK);
	}
	 
}

