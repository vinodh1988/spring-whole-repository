package com.system;

import org.springframework.stereotype.Component;

@Component("reporting")
public class LatestReporting implements Subtasks {

	@Override
	public void perform() {
		// TODO Auto-generated method stub
        System.out.println("Creating the reporting document");
	}

}
