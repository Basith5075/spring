package com.springorm.dao;

import java.util.List;

import com.springorm.entities.Employee;

public interface EmployeeDao {

	public int insert(Employee emp);
	public void update(Employee emp);
	public void delete(int empId);
	public Employee getEmp(int empId);
	public List<Employee> getAllEmp();
	
}
