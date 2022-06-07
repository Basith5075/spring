package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("student1")
public class Student {
	
	@Value("Basith Mohammed")
	private String student;

	private Exam exam;
	
	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public String getStudent() {
		return student;
	}

	@Override
	public String toString() {
		return "Student [student=" + student + ", exam=" + exam + "]";
	}

	public void setStudent(String student) {
		this.student = student;
	}
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Exam exam) {
		this.exam = exam;
		this.exam.display();
	}
}
