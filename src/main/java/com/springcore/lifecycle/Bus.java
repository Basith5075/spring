package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bus {

	private int ticketPrice;
	
	
	@Override
	public String toString() {
		return "Bus [price=" + ticketPrice + "]";
	}


	public Bus(int ticketPrice) {
		super();
		this.ticketPrice = ticketPrice;
	}


	public int getPrice() {
		return ticketPrice;
	}


	public void setPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		
		System.out.println("Init method called -- Bus");
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("Init method called -- Bus");
	
	}

}
