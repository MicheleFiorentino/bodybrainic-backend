package com.mf.bodybrainic.repository.api;

import com.mf.bodybrainic.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDAO extends JpaRepository<Person,Long> {
}
