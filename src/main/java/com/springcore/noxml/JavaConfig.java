package com.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.noxml")
public class JavaConfig {
	
	@Bean
	public Exam getExam() {
		
		Exam exam = new Exam();
		exam.setSubject("telugu");
		return exam;
	}
	
	@Bean
	public Student getStudent() {
		Student stud = new Student(getExam());
		return stud;
	}
	
}
