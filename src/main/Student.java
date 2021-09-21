package main;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private String grade;
	private double tuition;
	private double feesTotal;

	public Student() {

	}

	public Student(int id, String name, String grade, double tuition) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.tuition = tuition;
	}

	public double getTuition() {
		return tuition;
	}

	public void setTuition(double tuition) {
		this.tuition = tuition;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", tuition=" + tuition + ", feesTotal="
				+ feesTotal + "] \n";
	}

}


