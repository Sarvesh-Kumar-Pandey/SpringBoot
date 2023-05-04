package in.nit.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyReportService {
	//@Scheduled(initialDelay=5000,fixedDelay=2000)
	//@Scheduled(fixedRate=2000)
	@Scheduled(cron="*/10 *  * * * *")
	//@Scheduled(initialDelay =8000,fixedDelay =3000)
	public void genRepo() {
		System.out.println("Hello"+new Date());
	}

}
