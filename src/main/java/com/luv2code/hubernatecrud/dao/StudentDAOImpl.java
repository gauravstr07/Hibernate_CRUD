package com.luv2code.hubernatecrud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.hubernatecrud.entity.Student;

import jakarta.persistence.EntityManager;

@Repository
public class StudentDAOImpl implements StudentDAO{

	
	private EntityManager entityManager;
	
	@Autowired
	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	
	@Override
	@Transactional
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		entityManager.persist(theStudent);
	}

}













