package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MyMassageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Welcome to First Runner Ex!");

	}

}
