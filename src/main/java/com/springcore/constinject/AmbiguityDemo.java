package com.springcore.constinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmbiguityDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constinject/ambiguitySolution.xml");
		
		AmbigTest at = (AmbigTest) context.getBean("AmbigTest");
		at.doSum();
		
	}

}
