package com.springcore.constinject;

import java.util.List;

public class Person {
	
	
	private String name;
	private int id;
	private Certificates cert;
	private List<String> address;
	
	public Person(String name, int id, Certificates cert, List<String> address) {
		
		this.name = name;
		this.id = id;
		this.cert = cert;
		this.address = address;
		
	}
	
	@Override
	public String toString() {
		
		return id+" : "+name+" : "+cert+" : "+address;
	}
}
