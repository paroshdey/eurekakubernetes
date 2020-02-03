package com.amdocs.EurekaClient1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@Autowired
	RestTemplate template;
	
	@GetMapping("/getData")
	public String getData() {
		
		return template.getForObject("http://client2/getData", String.class);
		
	}
	
	
	
}
