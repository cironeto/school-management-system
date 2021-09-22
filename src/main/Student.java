package main;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private double tuition;
	private double registrationFee;
	private double[] grade;
	private Course course;

	public Student(String name, double tuition, double registrationFee, Course course) {
		this.name = name;
		this.tuition = tuition;
		this.registrationFee = registrationFee;
		this.course = course;
	}

	public Student() {

	}

	

}


