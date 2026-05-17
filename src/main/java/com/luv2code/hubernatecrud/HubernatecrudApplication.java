package com.luv2code.hubernatecrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.hubernatecrud.dao.StudentDAO;
import com.luv2code.hubernatecrud.entity.Student;

@SpringBootApplication
public class HubernatecrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HubernatecrudApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			
			createMultipleStudent(studentDAO);
		};
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		// TODO Auto-generated method stub
		
		Student tempStudent1 = new Student("John", "Doe", "john.doe@gmail.com");
		Student tempStudent2 = new Student("Alice", "Smith", "alice.smith@gmail.com");
		Student tempStudent3 = new Student("Bob", "Johnson", "bob.johnson@gmail.com");
		Student tempStudent4 = new Student("Clara", "Brown", "clara.brown@gmail.com");
		Student tempStudent5 = new Student("David", "Wilson", "david.wilson@gmail.com");
		
		
		System.out.println("Saving the Students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);
		studentDAO.save(tempStudent5);
	}

	private void createStudent(StudentDAO studentDAO) {
		// TODO Auto-generated method stub
		
		System.out.println("Creating new student object...");
		
		Student tempStudent = new Student("Mama", "Dang", "mamad@gmail.com");
		
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);
		
		System.out.println("Student saved. Generated Id - " + tempStudent.getId());
	}
	
}














