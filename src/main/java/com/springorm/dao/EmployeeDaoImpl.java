package com.springorm.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springcore.noxml.Student;
import com.springorm.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private HibernateTemplate hibernateTemplate;

	@Transactional // This annotation is must for insert,update and delete and not req for select operations
	public int insert(Employee emp) {

		Integer res = (Integer) hibernateTemplate.save(emp);
		return res;
	}
	
	@Transactional
	public void update(Employee emp) {
		
		hibernateTemplate.update(emp);
	
	}
	@Transactional
	public void delete(int empId) {
		
		Employee emp = hibernateTemplate.get(Employee.class, empId);
		
		hibernateTemplate.delete(emp);
		
	}

	public Employee getEmp(int empId) {
		Employee emp = hibernateTemplate.get(Employee.class, empId);
		return emp;
	}

	public List<Employee> getAllEmp() {
		
		List<Employee> empList = hibernateTemplate.loadAll(Employee.class);
		return empList;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
