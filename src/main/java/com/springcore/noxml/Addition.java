package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Addition {
	
	@Value("545")
	private int x;
	@Value("55")
	private int y;
	
	@Override
	public String toString() {
		return "Addition [x=" + x + ", y=" + y + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	
	public void sum() {
		System.out.println("Sum = "+(this.x+this.y));
	}
}
