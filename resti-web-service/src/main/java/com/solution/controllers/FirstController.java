package com.solution.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.solution.model.Person;
import com.solution.specifications.DataService;
import com.solution.utilities.RecordAlreadyExistsException;
import com.solution.utilities.RecordNotFoundException;


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
	
	@GetMapping("/dbpeople")
	public List<Person> get1(){
		return service.getPeopleFromDB();
	}
	
	@PostMapping("/dbpeople")
	public ResponseEntity<String> addPerson(@RequestBody Person person)
	{
		try {
			service.addPerson(person);
			return new ResponseEntity<String>("Successfully inserted",HttpStatus.CREATED);
		}
		catch(RecordAlreadyExistsException e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	
	@RequestMapping(value="/dbpeople",method = {RequestMethod.PUT,RequestMethod.PATCH})
	public ResponseEntity<String> updatePerson(@RequestBody Person person)
	{
		try {
			service.updatePerson(person);
			return new ResponseEntity<String>("Successfully updated",HttpStatus.OK);
		}
		catch(RecordNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	
	@DeleteMapping(value="dbpeople/{sno}")
	public ResponseEntity<String> deletePerson(@PathVariable("sno") Integer sno)
	{
		try {
			service.deletePerson(sno);
			return new ResponseEntity<String>("Successfully deleted",HttpStatus.OK);
		}
		catch(RecordNotFoundException e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
}
