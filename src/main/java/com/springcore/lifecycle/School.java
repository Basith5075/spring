package com.springcore.lifecycle;

public class School {
	
	private String student;

	public String getStudent() {
		return student;
	}
	
	public void init() {
		
		System.out.println("Starting the school --- init method");
	}
	
	public void destroy() {
		System.out.println("Closing the school -- destroy method");
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public School(String student) {
		super();
		this.student = student;
		
		System.out.println("Enrolling the student -- Initializing the student variable");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return student;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
