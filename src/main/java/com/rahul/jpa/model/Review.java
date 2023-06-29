package com.rahul.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Review extends CommonModel{
    String rating;
    String description;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @ManyToOne
    Course course;
    @Override
    public String toString() {
        return "Review{" +
                "rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }

    public Review(String rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public Review() {
    }
}
