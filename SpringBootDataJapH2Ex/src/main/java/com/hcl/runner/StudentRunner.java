package com.hcl.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hcl.model.Student;
import com.hcl.repo.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;	
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Student(10, "RAJ", 3500.0));
		repo.save(new Student(11, "SAM", 4500.0));
		repo.save(new Student(12, "KHAN", 5600.0));
		System.out.println("--DONE--");
		//repo.deleteById(12);
		
		Optional<Student> opt=repo.findById(12);
		  if(opt.isPresent()) { //avoid NEP
		     System.out.println(opt.get());
		  }
		
	}

}

