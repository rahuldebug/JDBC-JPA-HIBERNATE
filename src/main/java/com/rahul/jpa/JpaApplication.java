package com.rahul.jpa;

import com.rahul.jpa.model.Person;
import com.rahul.jpa.repository.CourseRepo;
import com.rahul.jpa.repository.PersonRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
//@AllArgsConstructor
public class JpaApplication implements CommandLineRunner {
    PersonRepo personRepo;
    CourseRepo courseRepo;
    // @Autowired

    public JpaApplication(PersonRepo personRepo, CourseRepo courseRepo) {
        this.personRepo = personRepo;
        this.courseRepo=courseRepo;
    }
    //  PersonRepository repository;


    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        var result = personRepo.findAll();
        System.out.println(result);
        //Person person = new Person()
        //repo.save(person);
        //repo.save(Person.builder().name("rahul").location("location").birthDate(new Date()).build());
        personRepo.save(new Person( "rahul", "jamshedpur", new Date()));
        System.out.println(courseRepo.findAll());
        System.out.println(personRepo.findAll());
        // System.out.println(repository.insert(person1));
        //System.out.println(repository.findById(1001));
    }
}
