package main;

public class Teacher {
	private String name;
	private double salary;
//	private String courses;
	
	
	
	public Teacher() {		
	}


	public Teacher(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Teacher [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
