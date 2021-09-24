package main;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private double tuition;
	private double registrationFee;
	private double[] grade;
	private String course;

	public Student(String name, double tuition, double registrationFee, String course) {
		this.name = name;
		this.tuition = tuition;
		this.registrationFee = registrationFee;
		this.course = course;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", tuition=" + tuition + ", registrationFee=" + registrationFee
				+ ", grade=" + Arrays.toString(grade) + ", course=" + course + "]";
	}

	

}


