package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringDemo {

	public static void main(String[] args) {
		
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/autowiring/autowiringconfig.xml");
		Emp emp = context.getBean("emp", Emp.class);
		System.out.println(emp);
	}

}
