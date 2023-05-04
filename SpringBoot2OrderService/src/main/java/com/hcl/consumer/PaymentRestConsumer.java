package com.hcl.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentRestConsumer {

	// @Autowire Discovery Client object
	@Autowired
	private DiscoveryClient client;
	
	public String doPayFromConsumer() {
		//Get Instances based on ServiceId using DC
		List<ServiceInstance> list  = client.getInstances("PAYMENT-SERVICE");
		
		//Read one instance (index#0)
		ServiceInstance si = list.get(0);
		
		//Create URL as URI + Resource Path
		String url = si.getUri() + "/pay";
		
		//Create RestTemplate object
		RestTemplate rt = new RestTemplate();
		
		//make GET call
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		
		return response.getBody();
	}
}