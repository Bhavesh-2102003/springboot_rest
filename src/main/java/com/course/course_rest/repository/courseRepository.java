package com.course.course_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.course_rest.model.Course;

public interface courseRepository extends JpaRepository<Course, Integer>{

}
