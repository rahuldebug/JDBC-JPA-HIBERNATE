package com.rahul.jpa;

import com.rahul.jpa.model.*;
import com.rahul.jpa.repository.*;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Optional;

@SpringBootApplication
//@AllArgsConstructor
public class JpaApplication implements CommandLineRunner {
    PersonRepo personRepo;
    CourseRepo courseRepo;
    // @Autowired
    StudentRepo studentRepo;
    PassportRepo passportRepo;

    ReviewRepo reviewRepo;

    public JpaApplication(PersonRepo personRepo, CourseRepo courseRepo, StudentRepo studentRepo, PassportRepo passportRepo , ReviewRepo reviewRepo) {
        this.personRepo = personRepo;
        this.courseRepo = courseRepo;
        this.studentRepo = studentRepo;
        this.passportRepo = passportRepo;
        this.reviewRepo=reviewRepo;
    }
    //  PersonRepository repository;


    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);

    }

    @Override
    //Transactional maintains session bean in lazy initialization
    @Transactional
    public void run(String... args) throws Exception {
        var result = personRepo.findAll();
        //   System.out.println(result);
        //Person person = new Person()
        //repo.save(person);
        //repo.save(Person.builder().name("rahul").location("location").birthDate(new Date()).build());
        personRepo.save(new Person("rahul", "jamshedpur", new Date()));
        // System.out.println(courseRepo.findAll());
        //  System.out.println(personRepo.findAll());
        //  System.out.println(studentRepo.findById(5001));
        Optional<Student> student = studentRepo.findById(3001);
        System.out.println(student);
        System.out.println(student.get().getPassport());
        Optional<Passport> passport = passportRepo.findById(5001);
        System.out.println(passport.get());
        System.out.println(passport.get().getStudent());
        // System.out.println(repository.insert(person1));
        //System.out.println(repository.findById(1001));
        testManyToOne();
    }

    private void testManyToOne() {
       Optional<Review> review= reviewRepo.findById(4001);
       Course course=review.get().getCourse();
        System.out.println(review);
        System.out.println(course);
    }


}
