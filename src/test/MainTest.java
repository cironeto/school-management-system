package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import main.Course;
import main.School;
import main.Secretary;
import main.Seller;
import main.Student;
import main.Teacher;

public class MainTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		School school = new School();
		List<Student> students = new ArrayList<>();
		List<Teacher> teachers = new ArrayList<>();
		List<Seller> sellers = new ArrayList<>();
		List<Secretary> secretaries = new ArrayList<>();

		int option = 0;

		do {
			// MAIN MENU
			System.out.println("=======================================");
			System.out.println("YOU ARE ... :");
			System.out.println("1 - Student");
			System.out.println("2 - Teacher");
			System.out.println("3 - Secretary");
			System.out.println("4 - Seller");
			System.out.println("5 - Exit");
			System.out.println("=======================================");

			option = input.nextInt();

			switch (option) {

			case 1:
				do {
					System.out.println("=======================================");
					System.out.println("1 - See my grade");
					System.out.println("2 - See my info");
					System.out.println("3 - Change my info");
					System.out.println("4 - Exit");
					System.out.println("=======================================");

					switch (option) {
					case 1:
					case 2:
					case 3:
					case 4:
					default:

					}

				} while (option != 4);
			case 2:
				do {
					System.out.println("=======================================");
					System.out.println("1 - See my courses");
					System.out.println("2 - See my info");
					System.out.println("3 - Change my info");
					System.out.println("4 - Exit");
					System.out.println("=======================================");

					switch (option) {
					case 1:
					case 2:
					case 3:
					case 4:
					default:

					}

				} while (option != 4);
			case 3:
				do {
					System.out.println("=======================================");
					System.out.println("1 - See all the studentes");
					System.out.println("2 - See all the teachers");
					System.out.println("3 - Change my info");
					System.out.println("4 - Exit");
					System.out.println("=======================================");

					switch (option) {
					case 1:
					case 2:
					case 3:
					case 4:
					default:

					}

				} while (option != 4);
			case 4:
				int optionSeller = 0;
				
				do {
					System.out.println("=======================================");
					System.out.println("1 - Sign up a student");
					System.out.println("2 - See my sales commission");
					System.out.println("3 - Change my info");
					System.out.println("4 - Exit");
					System.out.println("=======================================");
					
					optionSeller = input.nextInt();

					switch (optionSeller) {
					case 1:
						System.out.println("Name: ");
						String name = input.next();
						System.out.println("Registration Fee: ");
						double regFee = input.nextDouble();
						System.out.println("Tuition: ");
						double tuition = input.nextDouble();
						System.out.println("Course: ");
						String course = input.next();
						
						Student student = new Student(name, regFee, tuition, course);
						break;

					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					default:
						break;

					}

				} while (option != 4);

			}
		} while (option != 5);
	}
}
