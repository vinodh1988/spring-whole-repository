package com.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.system"})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(DemoApplication.class, args);
		System.out.println("Spring boot APP");
	    String task="testing";
	    
	    com.system.Process p=(com.system.Process)ac.getBean(task);
	    System.out.println(p.hashCode());
	    p.task();
	  /*  p=(com.system.Process)ac.getBean(task);
	    System.out.println(p.hashCode());*/
	
	}

}

/*
 * 
 *   com.system.Process p;
	    if(task.equals("documentation"))
	       p=new Documenting();
	    else
	       p=new Testing();
	    
	    p.task();*/
