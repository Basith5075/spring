package com.springcore.constinject;

public class Certificates {
	
	private String certName;
	
	public Certificates(String certName) {
	
		this.certName = certName;
	}
	
	public Certificates() {
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return certName;
	}
}
