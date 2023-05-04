package com.in;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in.model.Product;
import com.in.repo.ProductRepository;

@SpringBootApplication
public class SpringBootCurdEmpApplication2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootCurdEmpApplication2Application.class, args);
	             ProductRepository productRepository=context.getBean(ProductRepository.class);
	             
//	             Product p=new Product();
//	             p.setId(101);
//	             p.setPName("lps");
//	             p.setQty(3);
//	             p.setDesc("dell");
//	            // Product result=productRepository.save(p);
//	             //System.out.println(result);
//	             
//	             
//	             Product p1=new Product();
//	             p1.setId(102);
//	             p1.setPName("mobile");
//	             p1.setQty(10);
//	             p1.setDesc("vivo");
//	             
//	             Product p2=new Product();
//	             p2.setId(103);
//	             p2.setPName("led blub");
//	             p2.setQty(4);
//	             p2.setDesc("phlips");
//	             
//	             List<Product> list=List.of(p,p1,p2);
//	            Iterable<Product> result=productRepository.saveAll(list);
//	            result.forEach(pro->{
//	            	System.out.println(pro);
//	            });
//	            
//	            //update
//	           Optional<Product> optional =productRepository.findById(103);
//               Product p=optional.get();
//               p.setDesc("Fan");
//              Product result= productRepository.save(p);
//              System.out.println(p);
	             
//	             // read data
//	         Iterable<Product> result= productRepository.findAll();
//	            result.forEach(pro->{System.out.println(pro);});
	
	    // delete
	             productRepository.deleteById(103);
	}

}
