package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("addressa")
	private Address address;
	
	public Address getAddress() {
	return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("calling setter method");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}


//	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("calling constructor");
	}


	public Emp() {
		
	}

}
