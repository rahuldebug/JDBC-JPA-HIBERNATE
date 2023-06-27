package com.rahul.jpa.repository;

import com.rahul.jpa.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {
}
