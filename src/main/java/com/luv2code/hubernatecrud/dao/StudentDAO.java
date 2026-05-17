package com.luv2code.hubernatecrud.dao;

import java.util.List;

import com.luv2code.hubernatecrud.entity.Student;

public interface StudentDAO {
	
	void save(Student theStudent);
	
	Student findById(Integer id);
	
	List<Student> findAll();
	
	List<Student> findByLastName(String lastName);
	
}
