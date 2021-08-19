package com.vardhan.demo.model;

import java.util.Arrays;
import java.util.List;

public class Student {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<Student> loadData() {
		return Arrays.asList(new Student(1, "Raja"), new Student(2, "Sheshu"));
	}
}
