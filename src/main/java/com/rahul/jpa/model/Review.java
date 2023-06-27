package com.rahul.jpa.model;

import jakarta.persistence.Entity;

@Entity
public class Review extends CommonModel{
    String rating;
    String description;

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
