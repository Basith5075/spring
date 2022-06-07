package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Tuition implements InitializingBean,DisposableBean {
	
	private int tuitionFee;

	public Tuition(int tuitionFee) {
		super();
		this.tuitionFee = tuitionFee;
		
		System.out.println("Setting the Tuition fee -- parameterized constructor..");
	}

	public int getTuitionFee() {
		return tuitionFee;
	}

	public void setTuitionFee(int tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	@Override
	public String toString() {
		return "Tuition [tuitionFee=" + tuitionFee + "]";
	}

	public Tuition() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() throws Exception {
		
		System.out.println("Destroy method called");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method called");
		
	}

}
