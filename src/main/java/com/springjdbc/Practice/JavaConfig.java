package com.springjdbc.Practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import com.springjdbc.Practice.dao.StudentDao;
import com.springjdbc.Practice.dao.StudentDaoImp;
import com.springjdbc.Practice.entities.Student;

@Configuration
@ComponentScan(basePackages = {"com.springjdbc.Practice.dao"})
public class JavaConfig {

	@Bean(name= {"ds"})
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("9908401215");		
		return ds;
	}
	
	@Bean(name = {"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
	}
	
//	@Bean("StudentDaoImp")
//	public StudentDao getStudentDao() {
//		
//		StudentDaoImp studentDao = new StudentDaoImp();
//		studentDao.setJdbcTemplate(getJdbcTemplate());
//		
//		return studentDao;
//		
//	}

	@Bean("student1")
	public Student setStudent() {
		
		Student stud = new Student();
		stud.setId(14);
		stud.setName("Budha");
		stud.setCity("Panaji");
		
		return stud;
	}
	
	
}
