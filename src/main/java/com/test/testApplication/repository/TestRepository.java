package com.test.testApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.test.testApplication.dto.StudentDto;
import com.test.testApplication.entity.Student;

@Repository
public interface TestRepository extends JpaRepository<Student,Long>{

	Student findByEmail(String email);

	//ResponseEntity<StudentDto> findOne(Long id);

	StudentDto findOne(Long id);
	
	//Student findById(Long id);

}
