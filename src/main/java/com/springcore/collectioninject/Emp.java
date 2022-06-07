package com.springcore.collectioninject;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	
	private int id;
	private String name;
	private List<String> phoneNum;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties p;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(List<String> phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	
	public Properties getP() {
		return p;
	}
	public void setP(Properties p) {
		this.p = p;
	}

	public Emp(int id, String name, List<String> phoneNum, Set<String> address, Map<String, String> courses,
			Properties p) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.courses = courses;
		this.p = p;
	}
	public Emp() {
		super();
	}
	
	
}
