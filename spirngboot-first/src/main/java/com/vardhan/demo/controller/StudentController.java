package com.vardhan.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vardhan.demo.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	@GetMapping("getAll")
	public List<Student> getStudentDetails() {
		return Student.loadData();
	}

	@PostMapping("save")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println(student);
		return student;
	}
}
