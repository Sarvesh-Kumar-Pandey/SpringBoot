package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class SpringBoot2ProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2ProducerServiceApplication.class, args);
	}

}
