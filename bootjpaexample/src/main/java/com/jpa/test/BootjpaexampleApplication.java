package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.model.User;
import com.jpa.test.repo.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
		 UserRepository userRepository=context.getBean(UserRepository.class);       
		  User user=new User();
	      user.setId(101);
	      user.setName("Sarvesh");
	      user.setCity("Bangalore");
	      user.setStatus("Java Developer");
	   User user1  = userRepository.save(user);
	   System.out.println(user1);
	   
	  System.out.println("done");
	}

}
