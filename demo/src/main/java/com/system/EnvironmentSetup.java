package com.system;

import org.springframework.stereotype.Component;

@Component("environment")
public class EnvironmentSetup implements Subtasks {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Setting up the environment for running the test cases");
	}
	
	

}
