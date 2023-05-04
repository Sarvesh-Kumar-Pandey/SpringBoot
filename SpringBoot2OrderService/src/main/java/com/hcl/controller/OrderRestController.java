package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.consumer.PaymentRestConsumer;

@RestController
public class OrderRestController {

	@Autowired
	private PaymentRestConsumer consumer;

	@GetMapping("/order")
	public String showOrderData() {
		return "FROM ORDER=>" + consumer.doPayFromConsumer();
	}
}