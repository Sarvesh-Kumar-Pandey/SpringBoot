package com.hcl.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Student;

@RestController
public class StudentController {

	@GetMapping("/a")
	public String showA() {
		return "Hello A";
	}

	@GetMapping("/b")
	public Student showB() {
		return new Student(10,"ABC",3.3);
	}

	@GetMapping("/c")
	public List<Student> showC() {
		return Arrays.asList(new Student(101,"abc",3.2),
				new Student(102,"A",3.0),
				new Student(103,"a",3.1),
				new Student(104,"abcd",3.8));

	}
	
	@GetMapping("/d")
	public Map<String,Student>showD() {
		return Map.of("s1",new Student(1,"A",4.2),
				"s2",new Student(2,"B",5.2),
				"s3",new Student(3,"C",6.2));
		
	}

}
