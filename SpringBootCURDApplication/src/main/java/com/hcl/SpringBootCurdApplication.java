package com.hcl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hcl.dao.UserRepositry;
import com.hcl.model.User;

@SpringBootApplication
public class SpringBootCurdApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootCurdApplication.class, args);
		UserRepositry userRepositry=context.getBean(UserRepositry.class);
		User user=new User();
		user.setName("Sarvesh");
		user.setAddress("Noida");
		User user1=userRepositry.save(user);
		System.out.println(user1);
		
		
	}

}
