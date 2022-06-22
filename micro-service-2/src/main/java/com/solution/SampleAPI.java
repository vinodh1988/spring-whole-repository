package com.solution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sampleapi")
public class SampleAPI {
     @GetMapping("/people")
     public String getPeople(){
    	 return "Hello World!!!";
     }
}
