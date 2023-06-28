package com.rahul.jpa.repository;

import com.rahul.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
