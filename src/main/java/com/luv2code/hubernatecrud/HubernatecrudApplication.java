package com.luv2code.hubernatecrud;

import java.util.List;

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
			
			//createMultipleStudent(studentDAO);
			
			//readStudent(studentDAO);
			
			//queryForStudent(studentDAO);
			
			findUserByLastName(studentDAO);
		};
	}

	private void findUserByLastName(StudentDAO studentDAO) {
		// TODO Auto-generated method stub
		
		List<Student> theStudents = studentDAO.findByLastName("Sutar");
		
		for(Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
		
	}

	private void queryForStudent(StudentDAO studentDAO) {
		// TODO Auto-generated method stub
		
		List<Student> theStudents = studentDAO.findAll();
		
		for(Student students: theStudents) {
			System.out.println(students);
		}
		
	}

	private void readStudent(StudentDAO studentDAO) {
		// TODO Auto-generated method stub
		
		Student tempStudent = new Student("Gaurav", "Sutar", "gauravstr05@gmail.com");
		
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
		
		int theId = tempStudent.getId();
		
		Student myStudent = studentDAO.findById(theId);
		System.out.println("Found the Student : " + myStudent.toString());
		
		
		
		
		
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














