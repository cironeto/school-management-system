package main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Student {
	private String id;
	private String name;
	private double tuition;
	private double registrationFee;
	private double[] grade;
	private String course;

	public Student(String name, double registrationFee, double tuition, String course) {
		this.name = name;
		this.tuition = tuition;
		this.registrationFee = registrationFee;
		this.course = course;
	}

	public Student() {

	}
	
	
	public String generateId(Random rng, String characters, int length)
	{
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = characters.charAt(rng.nextInt(characters.length()));
	    }
	    return new String(text);
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public void printStudent(){
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Tuition: " + tuition);
		System.out.println("Registration Fee: " + registrationFee);
		System.out.println("Course: " + course);
		System.out.println("Grades: " + grade);
	}

	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", tuition=" + tuition + ", registrationFee=" + registrationFee
				+ ", grade=" + Arrays.toString(grade) + ", course=" + course + "]";
	}

	

}


