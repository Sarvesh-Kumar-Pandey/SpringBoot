package in.nit.runner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.ToString;


@Component
@ToString
public class FallBackTestRunner implements CommandLineRunner {

   @Value("${my.id}")
   private Integer id;
   @Value("${my.id}")
   private String code;
   @Value("${my.id}")
   private double ver;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
