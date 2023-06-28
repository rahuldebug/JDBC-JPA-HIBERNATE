package com.rahul.jpa.model;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;

import java.util.Optional;

@Entity
public class Student extends CommonModel {
    String name;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    Passport passport;

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
    public Integer getId(){
        return id;
    }
}
