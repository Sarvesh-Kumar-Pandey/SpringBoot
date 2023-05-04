package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.service.AlertService;
@Component
public class ClientProfileTestRunner implements CommandLineRunner {
@Autowired
	private AlertService service;//has a
	
	@Override
	public void run(String... args) throws Exception {
		service.showMsg();

		
	 
	
	}

}
