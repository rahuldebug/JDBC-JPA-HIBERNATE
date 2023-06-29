package com.rahul.jpa.model;

import jakarta.persistence.*;

@Entity
public class Passport extends CommonModel {
    String number;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy ="passport")
    Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", id=" + id +
                '}';
    }

    public Passport() {
    }

    public Passport(String number) {
        this.number = number;
    }
}
