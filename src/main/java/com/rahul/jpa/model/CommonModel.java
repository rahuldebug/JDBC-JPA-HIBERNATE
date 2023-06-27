package com.rahul.jpa.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class CommonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
}
