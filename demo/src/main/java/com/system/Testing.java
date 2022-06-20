package com.system;

import org.springframework.beans.factory.annotation.Autowired;

public class Testing implements Process{

	@Autowired
	Subtasks reporting;// avoid new Reporting();
	
	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println("Testing activity");
		reporting.perform();
	}

}
