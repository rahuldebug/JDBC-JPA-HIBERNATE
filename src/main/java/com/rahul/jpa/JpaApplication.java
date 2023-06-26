package com.rahul.jpa;

import com.rahul.jpa.model.Person;
import com.rahul.jpa.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class JpaApplication implements CommandLineRunner {
    @Autowired
    PersonRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        //var person1= Person.builder().name("rahul").location("location").birthDate(new Date()).build();
        // System.out.println(repository.insert(person1));
        System.out.println(repository.findById(1001));
    }
}
