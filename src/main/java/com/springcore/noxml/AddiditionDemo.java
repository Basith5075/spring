package com.springcore.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AddiditionDemo {
	
	
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(TwoConfig.class);
		Addition add = con.getBean("addition5",Addition.class);
		System.out.println(add);
		add.sum();
	}
	
	
	
}
