package in.nit;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerApplication {

	public static void main(String[] args) {
		
	
	SpringApplication app=new SpringApplication(SpringBootBannerApplication.class);
	//app.setBannerMode(Banner.Mode.OFF);
	app.run(args);
	System.out.println("Welcome");
	

}
	}
