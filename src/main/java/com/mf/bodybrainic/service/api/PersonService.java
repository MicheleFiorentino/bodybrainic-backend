package com.mf.bodybrainic.service.api;

import com.mf.bodybrainic.model.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPeople();

    List<Person> getAllPeopleWithDoctors();

}
