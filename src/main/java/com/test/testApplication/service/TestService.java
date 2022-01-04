package com.test.testApplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.test.testApplication.dto.StudentDto;
import com.test.testApplication.entity.Student;
import com.test.testApplication.repository.TestRepository;

@Service
public class TestService {

	@Autowired
	TestRepository testRepository;
  
	public StudentDto save(StudentDto studentDto) {

		Student student = new Student();
		BeanUtils.copyProperties(studentDto, student);
		testRepository.save(student);
		Student savedStudent = testRepository.save(student);
		BeanUtils.copyProperties(savedStudent, studentDto);
		return studentDto;

	}

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
	      public void delete(Long id) {
		testRepository.deleteById(id);
 
		}


	    public StudentDto updateUsers(StudentDto studentDto) {
		Student student = new Student();
		BeanUtils.copyProperties(studentDto, student);
		testRepository.save(student);
		Student savedStudent = testRepository.save(student);
		BeanUtils.copyProperties(savedStudent, studentDto);
		return studentDto;

	}
	    
	    
	      public String validateEamil(String Email) {
	    	try {
	    		Student student = testRepository.findByEmail(Email);
	    	    if (student != null) {
	    	    return "email already exists";
	    	    }   
	    	    else {
	    	    return "email doesn't exists";
	    	    }
	    	} catch (Exception e) {
		    	e.printStackTrace();
		    	}
		    	return Email;


		

	    	


}
}