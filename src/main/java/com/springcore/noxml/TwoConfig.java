package com.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.noxml")/
public class TwoConfig {

	
	@Bean
	public Addition addition5() {
		
		Addition add = new Addition();
		
		return add;
	}
	
}
