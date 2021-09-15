package main;

public class Student {
	private int id;
	private String name;
	private String grade;
	private double feesPaid;
	private double feesTotal;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String grade, double feesPaid) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = feesPaid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", feesPaid=" + feesPaid + ", feesTotal="
				+ feesTotal + "]";
	}
	
	
	
}
