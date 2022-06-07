package com.springcore.refinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefInjectDemo {

	public static void main(String[] args) {
		
     ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/refinject/referenceconfig.xml");
     A aobj=  (A) context.getBean("aref");
     System.out.println(aobj);
	}

}
