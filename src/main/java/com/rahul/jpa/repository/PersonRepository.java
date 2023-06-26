package com.rahul.jpa.repository;

import com.rahul.jpa.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

//@Repository
//@Transactional
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public Person insert(Person person) {
       return  entityManager.merge(person);
    }

    public void update(Person person) {
        entityManager.merge(person);
    }

}
