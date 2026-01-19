package com.test.repository;
 
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.entity.Student;

import jakarta.transaction.Transactional;
 

@Transactional 
public interface StudentRepository extends JpaRepository<Student, Integer> {
 
	 
	
		
	@Query("select s from Student s where s.name=?1")
	public Optional<Student> getStudentByName(String name);
	
	@Query("select s from Student s where s.department =?1")
	public List<Student> getStudentByDepartment(String department);
		
		
	}
	
	
	
