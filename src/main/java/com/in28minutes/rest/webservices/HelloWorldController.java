package com.in28minutes.rest.webservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//GET
	//URI - /hello_world
	@GetMapping(path = "/hello_world")
	public String helloWorld() {
		return "Hello World";
	}

}
