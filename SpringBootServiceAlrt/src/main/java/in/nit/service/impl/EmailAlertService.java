package in.nit.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.nit.service.AlertService;
@Component
@Profile("default")
public class EmailAlertService implements AlertService {

	@Override
	public void showMsg() {
		// TODO Auto-generated method stub
		System.out.println("FROM DEFAULT EMAIL SERVICE");

	}

}
