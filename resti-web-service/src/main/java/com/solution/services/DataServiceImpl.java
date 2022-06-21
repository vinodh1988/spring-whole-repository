package com.solution.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.solution.model.Person;
import com.solution.specifications.DataService;

@Service
public class DataServiceImpl implements DataService{

	@Override
	public List<Person> getPeople() {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList<Person>();
		list.add(new Person(1,"Raju","Mumbai"));
		list.add(new Person(2,"Arjun","Chandigarh"));
		list.add(new Person(3,"Varun","Bhubaneshwar"));
		return list;
	}

}
