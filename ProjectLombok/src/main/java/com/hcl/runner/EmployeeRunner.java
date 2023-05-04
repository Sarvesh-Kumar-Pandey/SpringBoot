package com.hcl.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hcl.model.Employee;
@Component
public class EmployeeRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Employee emp=new Employee(101,"RAM",122.50,80.20);
		System.out.println("Employee detials "+emp);
		
		Employee e2=new Employee();
		e2.setEId(88);
		e2.setEName("SAM");
		e2.setESal(6.58);
		e2.setEMarks(58.65);
		
		System.out.println(e2);
		
	}

}
