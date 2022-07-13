package com.avinash.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/F1")
public class FirstController {

	
	
	@RequestMapping("/getNameList", method="get")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	
	
	
	
}
