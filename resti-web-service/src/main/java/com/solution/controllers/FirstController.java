package com.solution.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
   
	@GetMapping("/greet")
	public String greet() {
		return "Hello! Spring boot is working..still";
	}
	
}
