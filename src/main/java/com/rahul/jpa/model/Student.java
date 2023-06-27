package com.rahul.jpa.model;
import jakarta.persistence.Entity;

@Entity
public class Student extends CommonModel {
    String name;

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
