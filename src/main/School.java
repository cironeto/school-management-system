package main;

import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private double moneyEarned;
	private double moneySpent;
	
	public List<Teacher>  getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher>  teachers) {
		this.teachers = teachers;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
