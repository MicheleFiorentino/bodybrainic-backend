package com.mf.bodybrainic.service.impl;

import com.mf.bodybrainic.model.Person;
import com.mf.bodybrainic.repository.api.PersonDAO;
import com.mf.bodybrainic.service.api.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDAO personDAO;

    @Override
    public List<Person> getAllPeople() {
        return personDAO.findAll();
    }

    @Override
    public List<Person> getAllPeopleWithDoctors() {
        return personDAO.findAll();
    }
}
