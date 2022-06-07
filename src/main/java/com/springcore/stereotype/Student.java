package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	
	@Value("nahed")
	private String studentName;
	@Value("HYD")
	private String studentCity;
	public List<Integer> getPinCode() {
		return pinCode;
	}

	public void setPinCode(List<Integer> pinCode) {
		this.pinCode = pinCode;
	}

	@Value("#{pinList}")
	private List<Integer> pinCode;
	
	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + ", pinCode=" + pinCode + "]";
	}

	
}
