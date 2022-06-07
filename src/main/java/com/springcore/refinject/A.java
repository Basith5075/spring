package com.springcore.refinject;

public class A {
	
	private int y;
	private B ob;
	
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "A [y=" + y + ", ob=" + ob + "]";
	}
	public A(int y, B ob) {
		super();
		this.y = y;
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
