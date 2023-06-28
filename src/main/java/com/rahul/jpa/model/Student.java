package com.rahul.jpa.model;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;

import java.util.Optional;

@Entity
public class Student extends CommonModel {
    String name;
    @OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "passport_id", referencedColumnName = "id")
    Passport passport;

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
