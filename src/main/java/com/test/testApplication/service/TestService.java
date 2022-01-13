package com.test.testApplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.test.testApplication.dto.StudentDto;
import com.test.testApplication.dto.TestResponse;
import com.test.testApplication.entity.Student;
import com.test.testApplication.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	TestRepository testRepository;
  
	
	   // for save user
	    public StudentDto save(StudentDto studentDto) {
	   	Student student = new Student();
		BeanUtils.copyProperties(studentDto, student);
		testRepository.save(student);
		Student savedStudent = testRepository.save(student);
		BeanUtils.copyProperties(savedStudent, studentDto);
		return studentDto;
	    }
	    
	    //for get all users
         	public List<StudentDto> getAllStudent() {
		    List<StudentDto> response = new ArrayList<>();
		    List<Student> list = testRepository.findAll();
		    list.stream().forEach(singleStudent -> {
			StudentDto studentDto = new StudentDto();
			BeanUtils.copyProperties(singleStudent, studentDto);
	    	response.add(studentDto);
     		});
	    	return response;
	    }
         	
         //for get users by id
 	       public StudentDto getUserById(long id) {
 	    	StudentDto response=new StudentDto();
 			Student result =testRepository.findById(id).orElse(null);
 			if(result != null) {
 				BeanUtils.copyProperties(result, response);
 				return response;
 			}
 			else {
 				return null;
 			}	
 		} 	
         	
         //for delete user
	      public void delete(Long id) {
		  testRepository.deleteById(id);
   
		}
	      
        // for update users
	     public StudentDto updateStudent(Long id, StudentDto studentDto) {
	     if (testRepository.findById(id).isPresent()){
	     Student existingStudent = testRepository.findById(id).get();
	     existingStudent.setFirstname(studentDto.getFirstname());
	     existingStudent.setLastname(studentDto.getLastname());
	     existingStudent.setEmail(studentDto.getEmail());
	     existingStudent.setPassword(studentDto.getPassword());
	     Student updatedStudent = testRepository.save(existingStudent);
	     Student savedStudent = testRepository.save(existingStudent);
	     BeanUtils.copyProperties(savedStudent, studentDto);
	     return studentDto;
	     }else{
	            return null;
	          }
	      }
	     
		 

	     
	      //for validation of mail 
	     public String validateEamil(String Email) {
	    	try {

		        Student student = testRepository.findByEmail(Email);
		    	if (student != null) {
		    	return "email already exists";
		    	}

		    	}
	    	catch (Exception e) {
		    	e.printStackTrace();
		    	}
		    	return "email doesn't exists";
		    	}
	  
	}
	    




