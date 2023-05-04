package in.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulingExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulingExApplication.class, args);
	}

}
