package com.springcore.constinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constinject/constructconfig.xml");
		
		Person p1  = (Person) context.getBean("person");
		System.out.println(p1.toString());
	}
}
                          
                          
                          
                          
                          
                          
                          