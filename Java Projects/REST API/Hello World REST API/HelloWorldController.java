package com.rohan.rest.webservices.RestfulWebServices.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloWorldController {
	@RequestMapping(method = RequestMethod.GET,path="/hello-world")
	public String helloWorld() {
	return "Hello World";	
	}
	}
