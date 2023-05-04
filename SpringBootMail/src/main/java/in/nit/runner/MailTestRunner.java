package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import in.nit.service.NitMailService;
@Component
public class MailTestRunner implements CommandLineRunner {
    @Autowired
	private NitMailService email;

	@Override
	public void run(String... args) throws Exception {
	FileSystemResource file=new FileSystemResource("F:\\the hindu.webp");
	
	boolean sent=email.sendEmail("skpandey10695@gmail.com", 
			new String[] {
				"vbmk6789@gmail.com", 
				"kdipu100@gmail.com" 
					
			}, 
			new String[] {
					"rm705400@gmail.com",
					"skpandey10695@gmail.com", 
					"dharmendra123space@gmail.com" 
					
			}, "Welcome every one", 
			"<h3>Hello abcd</h3> <b>AA</b> <i>aa</i> <u>Welcome</u>"
			, file);
	if(sent) {
		System.out.println("sending failed..");
	}else {
		System.out.println("Email sent..");
	}
	
	
	
	
	}

}
