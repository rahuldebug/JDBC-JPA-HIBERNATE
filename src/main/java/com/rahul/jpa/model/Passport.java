package com.rahul.jpa.model;

import jakarta.persistence.Entity;

@Entity
public class Passport extends CommonModel {
    String number;

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
