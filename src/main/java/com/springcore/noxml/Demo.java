package com.springcore.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student stud = context.getBean("getStudent", Student.class);
		
		System.out.println(stud);
	}
	
}
