package com.solution.specifications;

import java.util.List;

import com.solution.model.Person;
import com.solution.utilities.RecordAlreadyExistsException;

public interface DataService {
    public List<Person> getPeople();
    public List<Person> getPeopleFromDB();
    public void addPerson(Person person) throws RecordAlreadyExistsException;
}
