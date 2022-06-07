package com.springcore.constinject;

public class AmbigTest {
	
	private int a;
	private int b;

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public AmbigTest(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("Calling Constructor (int, int)");
	}
	
	public AmbigTest(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		
		System.out.println("Calling Constructor (double, double)");
	}
	
	
	public AmbigTest(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		
		System.out.println("Calling Constructor (String, String)");
	}
	
	public void doSum() {
		
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		System.out.println("Sum of Two Numbers : "+(a+b));
	}
	
	public AmbigTest() {
	
	}
	
}
