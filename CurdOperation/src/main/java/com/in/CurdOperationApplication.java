package com.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in.model.User;
import com.in.repo.UserRepository;

@SpringBootApplication

public class CurdOperationApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(CurdOperationApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);       
//
//		User user=new User(); 
//
//		user.setName("Sarvesh");
//		user.setCity("Bangalore");
//		user.setStatus("Java Developer"); 
//		//		User user1 =
//		//				userRepository.save(user); 
//		//		System.out.println(user1);
//
//		// create object of user
//
//		User user1 =new User();
//		//user1.setId(100);
//		user1.setName("uttam");
//		user1.setCity("Ayodhya");
//		user1.setStatus("python programmer");
//
//		User user2 =new User();
//		//user1.setId(100);
//		user2.setName("Rohan");
//		user2.setCity("Lko");
//		user2.setStatus("Ruby programmer");
//
//		User user3 =new User();
//		//user1.setId(100);
//		user3.setName("Sohan");
//		user3.setCity("BSB");
//		user3.setStatus("HTML programmer");
//		//User result=userRepository.save(user2);
//		//	     System.out.println(result);
//
//		List<User> users=List.of(user,user1,user2,user3);
//		Iterable<User> result=userRepository.saveAll(users);
//		result.forEach(user4->{
//			System.out.println(user4);
//		});
//		System.out.println("done");

		// update
//			      Optional<User> optional=userRepository.findById(8);
//			      User user=optional.get();
//			      user.setName("Sarvesh Pandey");
//			      User result=userRepository.save(user);
//			      System.out.println(user);


		//		// get data
//				Iterable<User> itr=userRepository.findAll();
//				itr.forEach(user->{
//					System.out.println(user);
//				});

		// Delete the user element


		//		userRepository.deleteById(5);
		//		System.out.println("deleted from User");



	}

}
