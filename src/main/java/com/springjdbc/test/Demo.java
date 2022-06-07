package com.springjdbc.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo {

	static int id;
	static String name;
	static String city;
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/test/config.xml");
		
		System.out.println("Program Started");
		
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		String query = "insert into student (id,name,city) values (?,?,?)";		
		try {
		getDetails();
		int res = jdbcTemplate.update(query,id,name,city);
		System.out.println(res+" number of rows inserted...");
		
		}catch(DuplicateKeyException e){
			System.out.println("Error :: Inserting Duplicate Keys");
			}
		
		System.out.println("Program Ended...");
		
	}

	public static void getDetails() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter the Student ID:");
		id = Integer.parseInt(scan.nextLine());
		
		System.out.println("Please Enter the Student Name");
		name = scan.nextLine();
		
		System.out.println("Please Enter the Student City");
		city = scan.nextLine();
		
		
	}
}
