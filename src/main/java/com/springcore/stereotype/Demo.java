package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeconfig.xml");
		
		Student studObj = context.getBean("stud", Student.class);
		System.out.println("studObj object Hash code :: "+studObj.hashCode());
//		System.out.println(bean.getPinCode().getClass());
		Student studObj1 = context.getBean("stud", Student.class);
		System.out.println("studObj1 object Hash code :: "+studObj1.hashCode());
		System.out.println("-----------------------------------");
		
		
		Teacher teacher = context.getBean("teacher", Teacher.class);
		System.out.println("teacher object Hash code :: "+teacher.hashCode());

		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		System.out.println("teacher1 object Hash code :: "+teacher1.hashCode());
		
	}

}
