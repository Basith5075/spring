package com.springjdbc.Practice;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.Practice.dao.StudentDao;
import com.springjdbc.Practice.entities.Student;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/Practice/config.xml");

		System.out.println("Program Started");

		StudentDao studDaoBean = context.getBean("studentDao", StudentDao.class);

		//***** Program to insert the student records ******//
		
//		Insert by using the public int insert(Student student) method Student student
//		Student student = new Student(); 
//		student.setId(8); 
//		student.setName("Gam");
//		student.setCity("Gurugram"); 
//		int result = studDaoBean.insert(student);
		  
		 
//		 * Insert by using the public int insert() method

		/*
		 * 1. In this method we are providing the values to the Student object from the
		 * XMl configuration file 2. We are then providing the student object/bean
		 * directly to the StudentDaoImpl class method
		 */

//		int result = studDaoBean.insert();

//		System.out.println(result + " number of rows inserted successfully !!!");
		
		//***** Program to update the student records ******//
		
//		Student student = new Student(); 
//		student.setId(8); 
//		student.setName("Yuvraj");
//		student.setCity("Bangkok"); 
//		int result = studDaoBean.update(student);
//		
//		System.out.println(result + " number of rows updated successfully !!!");
		
		//***** Program to delete the student records ******//
//		
//		Student student = new Student(); 
//		student.setId(4); 
//		int result = studDaoBean.delete(student);
//		
//		System.out.println(result + " number of rows deleted successfully !!!");
		
		
		//***** Program to Select the student records ******//
		
//		Student student = studDaoBean.getStudentById(1);
//		
//		System.out.println(student);
		
//		List<Student> allStudents = studDaoBean.getAllStudents();
//		
//		for(Student s:allStudents) {
//			System.out.println(s);
//		}
	}
}