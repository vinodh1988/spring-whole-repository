package com.solution.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solution.model.Person;
import com.solution.repositories.PeopleRepository;
import com.solution.specifications.DataService;
import com.solution.utilities.RecordAlreadyExistsException;
import com.solution.utilities.RecordNotFoundException;

@Service
public class DataServiceImpl implements DataService{

	@Autowired 
	PeopleRepository peoplerepo;
	
	@Override
	public List<Person> getPeople() {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList<Person>();
		list.add(new Person(1,"Raju","Mumbai"));
		list.add(new Person(2,"Arjun","Chandigarh"));
		list.add(new Person(3,"Varun","Bhubaneshwar"));
		return list;
	}

	@Override
	public List<Person> getPeopleFromDB() {
		// TODO Auto-generated method stub
		return peoplerepo.findAll();
	}

	@Override
	public void addPerson(Person person) throws RecordAlreadyExistsException {
		// TODO Auto-generated method stub
		  Person p= peoplerepo.findBySno(person.getSno());
		  if(p==null)
		  {
			  peoplerepo.save(person);
		  }
		  
		  else
			  throw new RecordAlreadyExistsException();
	}

	@Override
	public void updatePerson(Person person) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		  Person p= peoplerepo.findBySno(person.getSno());
		  if(p!=null)
		  {
			  peoplerepo.save(person);
		  }
		  
		  else
			  throw new RecordNotFoundException();
	}

	@Override
	public void deletePerson(int sno) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		Person p = peoplerepo.findBySno(sno);
		if(p==null)
			throw new RecordNotFoundException();
		else
			peoplerepo.delete(p);
	}
	
	

}
