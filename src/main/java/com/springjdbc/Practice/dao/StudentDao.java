package com.springjdbc.Practice.dao;

import java.util.List;

import com.springjdbc.Practice.entities.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int insert();
	public int update(Student student);
	public int delete(Student stu);
	public Student getStudentById(int studentId);
	public List<Student> getAllStudents();
}
