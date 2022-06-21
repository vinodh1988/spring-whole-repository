package com.solution.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.solution.model.Person;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
public interface ApiSpec {
	@ApiOperation(value="list of People from table",response=Iterable.class)
	public List<Person> get1();
	@ApiOperation(value="Add Person to the table",response=Person.class)
	public ResponseEntity<String> addPerson(@RequestBody Person person);
	@ApiOperation(value="Update person details",response=String.class)
	public ResponseEntity<String> updatePerson(@RequestBody Person person);
	@ApiOperation(value="Delete a person if sno given",response=String.class)
	public ResponseEntity<String> deletePerson(@PathVariable("sno") Integer sno);
	

} 
