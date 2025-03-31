package com.course.course_rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.course_rest.exception.InvalidIDException;
import com.course.course_rest.model.Course;
import com.course.course_rest.repository.courseRepository;


@Service
public class CourseService {
	
	@Autowired
	private courseRepository courseRepo;

	public Course addCourse(Course course) {
		return courseRepo.save(course);
	}

	public List<Course> getAllCourse() {
		return courseRepo.findAll();
		
	}

	public Course getOne(int id) throws InvalidIDException {
		
		Optional<Course> optional = courseRepo.findById(id);
		
		if(optional.isEmpty())
		{
			throw new InvalidIDException("User ID is invalid");
		}
		return optional.get();
	}
}
