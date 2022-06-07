package com.springcore.refinject;

public class B {
	
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B(int x) {
		super();
		this.x = x;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "B [x=" + x + "]";
	}
	
	
	
}
