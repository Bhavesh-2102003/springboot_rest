package com.course.course_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.course_rest.dto.MessageResponseDto;
import com.course.course_rest.exception.InvalidIDException;
import com.course.course_rest.model.Course;
import com.course.course_rest.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private MessageResponseDto messageDto;
	
	@GetMapping("/api/course/hello")
	public String hello()
	{
		return "Hello from SpringBoot";
	}
	
	@PostMapping("/api/course/add")
	public Course addCourse(@RequestBody Course course)
	{
		return courseService.addCourse(course);
	}
	
	@GetMapping("/api/course/getAll")
	public List<Course> getAllCourse()
	{
		
		return courseService.getAllCourse();
	}
	
	@GetMapping("/api/course/one/{id}")
	public ResponseEntity<?> getOne(@PathVariable int id)
	{
		try
		{
			Course course=courseService.getOne(id);
			return ResponseEntity.ok(course);
		}
		catch(InvalidIDException e)
		{
			messageDto.setBody(e.getMessage());
			messageDto.setStatusCode(400);
			return ResponseEntity.status(400).body(messageDto); 
		}
		
	}
}
