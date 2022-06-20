package com.system;

import org.springframework.beans.factory.annotation.Autowired;

public class Testing implements Process{

	@Autowired
	Subtasks reporting;// avoid new Reporting();
	
	@Autowired
	Subtasks environment;
	
	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println("Testing activity");
	    environment.perform();
		reporting.perform();
	}

}
