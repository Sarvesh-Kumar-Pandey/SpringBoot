
package in.nit.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements CommandLineRunner {
    @Value("${my.db}")
	private String dbcode;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println(dbcode);
	}

}
