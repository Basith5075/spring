package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	private Map<String, Integer> courseFee;
	private Properties prop;
	
	

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	
	
	public Map<String, Integer> getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Map<String, Integer> courseFee) {
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courseFee=" + courseFee + ", prop=" + prop + "]";
	}
	
	
}
