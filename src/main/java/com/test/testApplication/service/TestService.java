package com.test.testApplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.test.testApplication.dto.StudentDto;
import com.test.testApplication.entity.Student;
import com.test.testApplication.repository.TestRepository;

@Service
@Component
public class TestService {
	
	private static List<Student> list =new ArrayList<>();

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
public List<StudentDto> getAllList() {


List<StudentDto> result = new ArrayList<>();

List<Student> list = testRepository.findAll();
list.stream().forEach(singleStudent -> {

StudentDto studentDto = new StudentDto();

BeanUtils.copyProperties(singleStudent, studentDto);
result.add(studentDto);

});
return result;

}




	
	
  
}






