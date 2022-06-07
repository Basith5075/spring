package com.springcore.collectioninject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collectioninject/collectionconfig.xml");
		
		Emp emp =	(Emp)context.getBean("emp1");
		
		System.out.println(emp.getId() + " : " +emp.getName());
		System.out.println(emp.getPhoneNum());
		System.out.println(emp.getAddress());
		System.out.println(emp.getCourses());
		System.out.println(emp.getP());
	}

}
