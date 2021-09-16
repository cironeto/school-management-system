package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import main.School;
import main.Student;
import main.Teacher;

public class MainTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		School school = new School();
		List<Student> students = new ArrayList<>();
		List<Teacher> teachers = new ArrayList<>();

		int option = 0;

		do {

			System.out.println("=======================================");
			System.out.println("Choose an option");
			System.out.println("1 - Register a Student");
			System.out.println("2 - Register a Teacher");
			System.out.println("3 - Students' total fees");
			System.out.println("4 - Total teachers' salary");
			System.out.println("5 - See all the students");
			System.out.println("6 - See all the teachers");
			System.out.println("7 - EXIT");
			System.out.println("=======================================");

			option = input.nextInt();

			switch (option) {

			case 1:
				System.out.println("How many students will be registred?");

				int numOfStudents = input.nextInt();
				
				if (numOfStudents > 0) {
				for (int i = 0; i < numOfStudents; i++) {

					System.out.println("Student's " + (i+1) + " ID:");
					int id = input.nextInt();
					System.out.println("Student's " + (i+1) + " name:");
					String name = input.next();
					System.out.println("Student's " + (i+1) + " grade:");
					String grade = input.next();
					System.out.println("Student's " + (i+1) + " :tuition");
					double tuition = input.nextDouble();

					Student student = new Student(id, name, grade, tuition);

					students.add(student);
					school.setStudents(students);
					System.out.println("Student registered: \n" + student);
					
				}
				}
				break;

			case 2:
				System.out.println("How many teachers will be registred?");
				
				int numOfTeachers = input.nextInt();
				
				if (numOfTeachers > 0) {
				for (int i = 0; i < numOfTeachers; i++) {

					System.out.println("Teacher's " + (i+1) + " ID:");
					int id = input.nextInt();
					System.out.println("Teacher's " + (i+1) + " name:");
					String name = input.next();
					System.out.println("Teacher's " + (i+1) + " salary:");
					double salary = input.nextDouble();

					Teacher teacher = new Teacher(id, name, salary);

					teachers.add(teacher);
					school.setTeachers(teachers);
					;
					System.out.println("Teacher registered: \n" + teachers);
				}
				}
				break;

			case 3:
				double sumTuitions = 0;
				for (Student student : students) {
					sumTuitions += student.getTuition();
				}				
				
				System.out.println("Students' total fees: " + sumTuitions);
				break;
				
			case 4:
				double sumSalaries = 0;
				for (Teacher teacher : teachers) {
					sumSalaries += teacher.getSalary();
				}				
				
				System.out.println("Teacher's' total salaries: " + sumSalaries);			
				break;
				
			case 5:	
				System.out.println("There are " + students.size() + " studentss registered");
				System.out.println(students);
				break;
				
			case 6:	
				System.out.println("There are " + teachers.size() + " teachers registered");
				System.out.println(teachers);
				break;
				
			case 7:
				break;

			default:
				System.out.println("Invalid option.");

			}

		} while (option != 7);
	}
}
