package com.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentRestController {

	@GetMapping("/pay")
	public String payment() {
		return "Payment-Service";
	}

}
