package com.api.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstPgrogram {
	
	
	@GetMapping("/first")
	public String firstMethod() {
		
		return "This is my first program in the SpringBoot";
	}
	

}
