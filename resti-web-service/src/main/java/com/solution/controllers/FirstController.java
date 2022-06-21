package com.solution.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solution.model.Person;
import com.solution.specifications.DataService;


@RestController
@RequestMapping("/api")
public class FirstController {
	@Autowired
	DataService service;
   
	@GetMapping("/greet")
	public String greet() {
		return "Hello! Spring boot is working..still";
	}
	
	@GetMapping("/people")
	public List<Person> get(){
		return service.getPeople();
	}
}
