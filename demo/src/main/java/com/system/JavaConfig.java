package com.system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
   
	@Bean("documentation")
	public Process getBean() {
		return new Documenting();
	}
	
	@Bean("testing")
	public Process getTesting() {
		return new Testing();
	}
}
