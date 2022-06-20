package com.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.system.Documenting;
import com.system.Testing;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(DemoApplication.class, args);
		System.out.println("Spring boot APP");
	    String task="documentation";
	    com.system.Process p;
	    if(task.equals("documentation"))
	       p=new Documenting();
	    else
	       p=new Testing();
	    
	    p.task();
	
	}

}
