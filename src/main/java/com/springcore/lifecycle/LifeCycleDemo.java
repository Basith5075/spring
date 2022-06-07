package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDemo {
	
	public static void main(String[] args) {
		
		 AbstractApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
//		 School bean = (School)context.getBean("school");
//		 
//		 System.out.println(bean);
//		 
//		 Tuition tut = (Tuition) context.getBean("tuition");
//		 System.out.println(tut);
		 
		 Bus bus = (Bus) context.getBean("bus");
		 
		 System.out.println(bus);
		 
		 context.registerShutdownHook(); // need to invoke this to call destroy() method
	}
	
}