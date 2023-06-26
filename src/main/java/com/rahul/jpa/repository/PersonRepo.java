package com.rahul.jpa.repository;

import com.rahul.jpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonRepo extends JpaRepository<Person, Integer> {
}
