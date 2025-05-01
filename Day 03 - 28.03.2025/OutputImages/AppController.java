package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;


@RestController
@RequestMapping("/app")
public class AppController {
	Student s1 = new Student("Ilmi","2020ICT01",23, "IT",3.2);
	Student s2 = new Student("Kushi","2020ASP57",24,"ASP",3.4);
	Student s3 = new Student("Amna","2020BIO84",24,"BIO",3.0);
	
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
	public Student getstudentbyReg(@PathVariable("reg") String regNo) {
		for(Student student:students) {
			if( student.getRegNo().equals(regNo)) {
				return student;
			}
		}
		return null;
	}
	
	@GetMapping("/stu/age-range")
	public List<Student> getStudentsByAgeRange() {
	    List<Student> filteredStudents = new ArrayList<>();
	    
	    for (Student student : students) {
	        if (student.getAge() >= 20 && student.getAge() <= 23) {
	            filteredStudents.add(student);
	        }
	    }   
	    return filteredStudents;
	}

	@GetMapping("/stu/gpa")
	public List<Student> getSortedStudentbyGPA(){
	    students.sort(Comparator.comparing(Student::getGpa));
	    return students;
	}

	@GetMapping("/addStudent/{nm},{reg},{ag},{crs},{gp}")
	public List<Student> addStudent(
		@PathVariable("nm") String name,
		@PathVariable("reg") String regNo,
    	@PathVariable("ag") int age,
    	@PathVariable("crs") String course,	
    	@PathVariable("gp") double gpa) {

    Student newstu = new Student(name, regNo, age, course, gpa);
    students.add(newstu);
    return students;
	}
	
	@GetMapping("/updateStudent/{nm}/{reg}/{ag}/{crs}/{gp}")
	
	public Student updateStudent(
	    @PathVariable("nm") String name,
	    @PathVariable("reg") String regNo,
	    @PathVariable("ag") int age,
	    @PathVariable("crs") String course,
	    @PathVariable("gp") double gpa) {

	    for(Student student : students) {
	        if(student.getRegNo().equals(regNo)) {
	            if (age > 0) {
	                student.setAge(age);
	            }
	            if (!course.equals("")) {
	                student.setCourse(course);
	            }
	            if (gpa > 0 && gpa <= 4) {
	                student.setGpa(gpa);
	            }
	            if (!name.equals("")) {
	                student.setName(name);
	            }
	            return student;
	        }
	    }
	    return null; // If no student found
	}

	@GetMapping("/deleteStudent/{reg}")
	public List<Student> deleteStudent(@PathVariable("reg") String regNo){
		for(Student student:students) {
			if(student.getRegNo().equals(regNo)) {
				students.remove(student);
			}
		}
		return students;
	}
	
}
