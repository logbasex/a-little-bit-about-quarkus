package com.logbasex.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/hello")
	public String hello(){
		return "Hello from Spring Boot. This is Logbasex";
	}
}
