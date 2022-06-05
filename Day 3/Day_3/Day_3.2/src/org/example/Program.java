package org.example;

class Student{
	private String name;
	private int marks;	//Min marks should be 0 and max marks should be 100
	public void setMarks(int marks) {
		if( marks < 0 || marks > 100 )
			throw new IllegalArgumentException("Invalid marks");
		this.marks = marks;
	}
}

public class Program {	//User of class Student
	public static void main(String[] args) {
		Student s1 = new Student( );
		//s1.name = "Sandeep";
		//s1.marks = 10;
		s1.setMarks(10);
	}
}
