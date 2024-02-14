package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Form {
	@PostMapping("/cal")
	public String Calculateper(@RequestParam String name,double marks1,double marks2,double marks3,double marks4) {
		double sum=marks1+marks2+marks3+marks4;
		double per=(sum/400)*100;
		return "Hey,"+name+"Your Percentage is "+per+"%";
	}

}
