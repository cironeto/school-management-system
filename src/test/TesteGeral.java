package test;

import java.util.Random;

import main.Student;

public class TesteGeral {

	public class GerarId {
		
		public int generateStudentId(){
			
			Random rnd = new Random();
			int id2 = 0;
			for (int i = 0; i < 4; i++) {
				id2 = id2 + rnd.nextInt(255);

			}
			return id2;
			
			}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println(student1.generateStudentId());

	}

}
