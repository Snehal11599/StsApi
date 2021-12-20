package com.test.testApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.testApplication.controller.entity.Student;
import com.test.testApplication.dto.StudentDto;
import com.test.testApplication.repository.TestRepository;

@Service
public class TestService {

@Autowired
TestRepository testRepository;

public StudentDto save (StudentDto studentDto) {
    
	Student student = new Student();
	BeanUtils.copyProperties(studentDto , student);
	testRepository.save(student);
	Student savedStudent = testRepository.save(student);
	BeanUtils.copyProperties(savedStudent , studentDto);
	return studentDto;

}

List<Student> list;
   

  public TestService() {
	  list=new ArrayList<Student>();
	 
	  
  }

public List<Student> getStudent() {
	
	return list;
}
  
  
}




