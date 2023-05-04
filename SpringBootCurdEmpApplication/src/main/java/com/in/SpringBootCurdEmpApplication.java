package com.in;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in.model.Employee;
import com.in.repo.EmployeeRepository;

@SpringBootApplication
public class SpringBootCurdEmpApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootCurdEmpApplication.class, args);
	      EmployeeRepository employeeRepository=context.getBean(EmployeeRepository.class);
	      Employee emp=new Employee();
	      emp.setId(101);
	      emp.setName("Ram");
	      emp.setDesc("programmer");
	      emp.setCity("delhi");
	      
	      Employee emp1=new Employee();
	      emp1.setId(102);
	      emp1.setName("shyam");
	      emp1.setDesc("qa");
	      emp1.setCity("Up");
	      
	      Employee emp2=new Employee();
	      emp2.setId(103);
	      emp2.setName("sohan");
	      emp2.setDesc("Dev");
	      emp2.setCity("Mp");
	      
	   //  Employee result=employeeRepository.save(emp);
	    // System.out.println(result);
	      List<Employee> emps=List.of(emp,emp1,emp2);
	      Iterable<Employee> result=employeeRepository.saveAll(emps);
	      result.forEach(empl->{
	    	  System.out.println(empl);
	    	  
	      });
//	      
//	     System.out.println("create operation done");
	      
//	      //update 
//	      Optional<Employee> optional
//	      =employeeRepository.findById(101);
//	      Employee emp=optional.get();
//	      emp.setName("Sarvesh Pandey");
//	     Employee result=employeeRepository.save(emp);
//	     System.out.println(result);
	      
	      // get read/get
//	     Iterable<Employee>result= employeeRepository.findAll();
//	     result.forEach(employee->{
//	    	 System.out.println(employee);
//	     });
	     
	     // delete
//	     employeeRepository.deleteById(103);
//	     System.out.println("deleted");
	      
	}

}
