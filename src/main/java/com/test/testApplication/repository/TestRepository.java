package com.test.testApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.testApplication.entity.Student;

@Repository
public interface TestRepository extends JpaRepository<Student,Long>{

	Student findByEmail(String email);

}
