package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {

//		1. Read
		List<Student> students = studentRepository.findAll();
	    for (Student student : students) {
			System.out.println(student);
		}
		
//		2. Inserting
//	    Student s4 = new Student();
//	    s4.setAddress("address4");
//	    s4.setCreated(new Date());
//	    s4.setName("RRR");
//	   // s4.setId(4);
//	    
//	    Student savedStudent = studentRepository.save(s4);
//	    System.out.println("Saved Student Id: " + savedStudent.getId());
	    
//		3. Updating
//	    s4.setName("AAA");
//	    s4.setAddress("address1");
//	    
//	    Student s1 = studentRepository.save(s4);
//	    System.out.println("Updated: " + s1);
//	    
//		4. Delete
		
	    //studentRepository.deleteById(1);
	    
	    
	    // select * from student where name = 'BBB'
	    Student std = studentRepository.findByName("BBB");
	    
	    System.out.println("New query1: "+ std);
	    
	    // select * from student where name = 'AAA' and address='address1'
	    
	    Student std2 = studentRepository.findByNameAndAddress("AAA", "address1");
	    System.out.println("new Query2: " + std2);
	}
	

	
}
