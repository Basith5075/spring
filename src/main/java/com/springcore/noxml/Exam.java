package com.springcore.noxml;

public class Exam {
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Exam [subject=" + subject + "]";
	}
	
	public void display() {
		System.out.println("Exposing Subject : "+this.subject);
	}
}
