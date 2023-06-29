package com.rahul.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Course extends CommonModel {

    private String name;
    @OneToMany(mappedBy = "course")
    private List<Review> reviews = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Review review) {
        reviews.add(review);
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
