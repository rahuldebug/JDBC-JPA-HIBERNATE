package com.rahul.jpa.model;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Entity
@SuperBuilder
public class Person extends CommonModel {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    int id;
    String name;
    String location;
    Date birthDate;

    public Person( String name, String location, Date birthDate) {

        this.name = name;
        this.location = location;
        this.birthDate = birthDate;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
