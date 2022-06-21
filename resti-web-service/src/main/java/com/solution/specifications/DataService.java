package com.solution.specifications;

import java.util.List;

import com.solution.model.Person;

public interface DataService {
    public List<Person> getPeople();
    public List<Person> getPeopleFromDB();
}
