package com.rahul.jpa.model;

import jakarta.persistence.Entity;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Course extends CommonModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
