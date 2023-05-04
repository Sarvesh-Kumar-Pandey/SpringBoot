package com.hcl.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

public class ProfilesEnvTestRunner implements CommandLineRunner {
	@Value("${my.db.name}")
	private String dbname;
	@Value("${my.db.url}")
	private String url;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Database is=>"+dbname+"-"+url);
	}

}
