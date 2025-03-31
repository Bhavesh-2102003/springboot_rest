package com.course.course_rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false)
	private String title;
	
	@Column
	private int fee=10000;
	
	@Column
	private int credits=100;

	public Course(int id, String title, int fee, int credits) {
		super();
		this.id = id;
		this.title = title;
		this.fee = fee;
		this.credits = credits;
	}

	public Course(String title, int fee, int credits) {
		super();
		this.title = title;
		this.fee = fee;
		this.credits = credits;
	}

	public Course() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	
}
