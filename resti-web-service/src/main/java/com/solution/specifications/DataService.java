package com.solution.specifications;

import java.util.List;

import com.solution.model.Dept;
import com.solution.model.Person;
import com.solution.utilities.RecordAlreadyExistsException;
import com.solution.utilities.RecordNotFoundException;

public interface DataService {
    public List<Person> getPeople();
    public List<Person> getPeopleFromDB();
    public void addPerson(Person person) throws RecordAlreadyExistsException;
    public void updatePerson(Person person) throws RecordNotFoundException;
    public void deletePerson(int sno) throws RecordNotFoundException;
    public void addDept(Dept dept) throws RecordAlreadyExistsException;
    public List<Dept> getDepts();
}
