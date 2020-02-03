package com.amdocs.EurekaClient2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;

@RestController
public class Client2Controller {
	
	@GetMapping("/getData")
	public String getData() {
		//discoveryClient.get
		return "Example of Service Discovery from client 2";

	}
	
}
