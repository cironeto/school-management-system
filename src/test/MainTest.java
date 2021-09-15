package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.School;
import main.Student;

public class MainTest {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int id = input.nextInt();
		String name = input.next();
		String grade = input.next();
		double feesPaid = input.nextDouble();
		
		Student student = new Student(id, name, grade, feesPaid);
		System.out.println(student);
		
		List<Student> students = new ArrayList<>();
		students.add(student);
		
		School school = new School();		
		school.setStudents(students);		
		System.out.println(students);
		
	}

}
