package com.springorm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.EmployeeDao;
import com.springorm.dao.EmployeeDaoImpl;
import com.springorm.entities.Employee;



public class DemoOrm {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config.xml");
		
		EmployeeDao employeeDao = context.getBean("employeeDao",EmployeeDao.class);
		System.out.println("program started");
		/*
		 * Employee emp = new Employee(2,"Abdul Khalid","Hyd"); int res =
		 * employeeDao.insert(emp);
		 * 
		 * System.out.println(res + " Number of rows inserted..");
		 * 
		 * System.out.println(employeeDao.getEmp(1));
		 */
		
		boolean loopStatus= true;
		
		while(loopStatus) {
		
		try {
			
			System.out.println("Welcome to my mini program !!");
			System.out.println("------------------------------");
			System.out.println("PRESS : 1 for inserting rows");
			System.out.println("PRESS : 2 for updating rows");
			System.out.println("PRESS : 3 for deleteing rows");
			System.out.println("PRESS : 4 for selecting single row");
			System.out.println("PRESS : 5 for selecting all rows");
			System.out.println("PRESS : 6 to exit");
			System.out.println("------------------------------");
			
			Scanner scan = new Scanner(System.in);
			Employee emp1= new Employee();
			int input = Integer.parseInt(scan.nextLine());
			
			switch (input) {
			case 1:
			
				System.out.println("Please Enter emp id");
				emp1.setEmpId(Integer.parseInt(scan.nextLine()));
				System.out.println("Please Enter emp Name");
				emp1.setEmpName(scan.nextLine());
				System.out.println("Please Enter emp City");
				emp1.setEmpCity(scan.nextLine());
				employeeDao.insert(emp1);
				break;
			case 2:
				System.out.println("Please Enter the id of record which you want to update:");
				emp1.setEmpId(Integer.parseInt(scan.nextLine()));
				System.out.println("Please Enter emp Name");
				emp1.setEmpName(scan.nextLine());
				System.out.println("Please Enter emp City");
				emp1.setEmpCity(scan.nextLine());
				employeeDao.update(emp1);
				break;
			case 5:
				List<Employee> listEmp= employeeDao.getAllEmp();
				
				System.out.println("Printing list of Employees");
				for(Employee list :listEmp) {
					System.out.println(list);
				}
				break;
				
			case 6:
				loopStatus = false;
				break;
			default:
				break;
			}
			
		} catch (Exception e) {
			System.out.println("Something went wrong !!");
			e.printStackTrace();
		}
		}
		
		System.out.println("Thank You !! Visit Again !!");
		
	}

}
