package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBoot2EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2EurekaServerApplication.class, args);
	}

}
