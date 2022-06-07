package com.springjdbc.Practice.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.Practice.entities.Student;

@Component("StudentDaoImp")
public class StudentDaoImp implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int insert(Student student) {
		
		String query = "insert into student (id, name, city) values (?,?,?)";
		
		int res = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return res;
	}
	public int insert() {
		
		String query = "insert into student (id, name, city) values (?,?,?)";
		
		int res = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return res;
	}

	public int update(Student student) {
		
		String query = "update student set name = ?, city = ? where id = ?";
		
		int result = jdbcTemplate.update(query, student.getName(),student.getCity(), student.getId());
		
		return result;
	}
	
	public Student getStudentById(int studentId) {
		
		String query = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student =  jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
		return student;
	}
	
	public List<Student> getAllStudents() {
		
		String query = "select * from student";
		
		  List<Student> students = jdbcTemplate.query(query,new RowMapperImpl());
		
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int delete(Student student) {
		
		String query = "delete from student where id = ?";
		
		int res = jdbcTemplate.update(query,student.getId());
		
		return res;
	}

}
