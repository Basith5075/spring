package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{5+6}")
	private int x;
	
	@Value("#{9/9}")
	private int y;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public float getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int num;
	
	@Value("#{T(java.lang.Math).PI}")
	private float num1;
	
	@Value("#{8>6}")
	private boolean result;
	
	@Value("#{165<45?'You Won':'You Loose'}")
	private String decision;
	
	@Value("#{new String('Abdul Basith Mohammed')}")
	private String newName;
	
	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}
	public boolean isResult() {
		return result;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", num=" + num + ", num1=" + num1 + ", result=" + result + ", decision="
				+ decision + ", newName=" + newName + "]";
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
	
	
}
