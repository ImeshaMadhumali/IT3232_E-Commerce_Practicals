package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;


@RestController
@RequestMapping("/app")
public class AppController {
	
	    Student s1 = new Student("2020ICT01","Ilmi",23, "IT",3.2);
	    Student s2 = new Student("2020ASP57","Kushi",24,"ASP",3.4);
	    Student s3 = new Student("2020BIO84","Amna",24,"BIO",3.0);
	
	    List<Student> students = new ArrayList<Student>();
	   
	    public AppController() {
	    	students.add(s1);
			students.add(s2);
			students.add(s3);
	    }
@GetMapping("/msg")
public String myMessage() {
	return "Hello SpringBoot";
	}
	@GetMapping("/name")
	public String MyName() {
		return "My name is SpringBoot";
	}
	@GetMapping("/age/{ag}")
	public String MyAge(@PathVariable("ag") int age) {
		return "My age is "+age;
	}
	@GetMapping("/hobby/{hob1},{hob2}")
	public String MyHobbies(@PathVariable("hob1") String hob1, @PathVariable("hob2") String hob2) {
		return "My hobbies are "+hob1+ "and "+hob2;
	}
	
	 @GetMapping("/studetails")
		public Student GetStudent() {
			return s1;
		}
	    
	    @GetMapping("/allstudetails")
		public List<Student> getAllStudents() {
			return students;
		}
	    @GetMapping("/stu/{reg}")
		public Student GetstudentbyRegNo(@PathVariable("reg") String regNo) {
			for(Student student:students) {
				if(student.getRegNo().equals(regNo)) {
					return student;
				}
			}
			return null;
		}
}
