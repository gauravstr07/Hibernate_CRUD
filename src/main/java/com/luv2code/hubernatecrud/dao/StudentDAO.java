package com.luv2code.hubernatecrud.dao;

import com.luv2code.hubernatecrud.entity.Student;

public interface StudentDAO {
	
	void save(Student theStudent);
	
	Student findById(Integer id);
	
}
