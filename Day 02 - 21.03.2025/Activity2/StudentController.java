package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class StudentController {
@GetMapping("/details")
public String StudentDetails() {
	String regno = "Registration Number: 2020ICT40";
	String course = "Course: IT";
	String name = "Name: Imesha";
	String age = "Age: 24";
	
	return regno + "<br>" + course + "<br>" + name + "<br>" + age;
	
	}

}
