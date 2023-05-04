package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Vendor;
import in.nit.repo.VendorRepo;
@Component
public class VendorDatatestRunner implements CommandLineRunner {
@Autowired
private VendorRepo repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Vendor (10,"Ajay","hyd","V1Ac2"));
		repo.save(new Vendor(11, "SYED", "BAN", "V2BDR"));
		  repo.save(new Vendor(12, "SAM", "DHL", "V55ER"));

	}

}
