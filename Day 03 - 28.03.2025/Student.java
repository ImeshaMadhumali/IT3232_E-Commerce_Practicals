package com.example.model;

public class Student {
private String name;
private String regNo;
private int age;
private String course;
private double gpa;

public Student(String name, String regNo, int age, String course, double gpa) {
	super();
	this.name = name;
	this.regNo = regNo;
	this.age = age;
	this.course = course;
	this.gpa = gpa;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRegNo() {
	return regNo;
}

public void setRegNo(String regNo) {
	this.regNo = regNo;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public double getGpa() {
	return gpa;
}

public void setGpa(double gpa) {
	this.gpa = gpa;
}

}
