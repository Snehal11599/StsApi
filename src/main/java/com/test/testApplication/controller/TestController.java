package com.test.testApplication.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.testApplication.dto.StudentDto;
import com.test.testApplication.dto.TestResponse;
import com.test.testApplication.entity.Student;
import com.test.testApplication.service.TestService;

@RestController
@RequestMapping("/hello")


public class TestController {

@Autowired

 private TestService testService;


@PostMapping(value = "/save")
public ResponseEntity<TestResponse<?>>saveUsers(@RequestBody StudentDto studentDto){
TestResponse<StudentDto> testResponse = new TestResponse<>();
StudentDto savedUserResponse = testService.save(studentDto);
testResponse.setHttpsStatus (HttpStatus.OK);
testResponse.setMessage ("saves successfully");
testResponse.setData(savedUserResponse);
        return new ResponseEntity<>( testResponse  , HttpStatus.OK);
}


@GetMapping ("/getUsers")

public List<StudentDto> getAllList() {
	return this.testService.getAllList();
}
	
	
}



        
       


	

