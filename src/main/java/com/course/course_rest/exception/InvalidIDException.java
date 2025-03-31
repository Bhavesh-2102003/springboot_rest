package com.course.course_rest.exception;

public class InvalidIDException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	private String message;
	
	
	public InvalidIDException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		return message;
	}
}