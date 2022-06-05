package org.example;

import in.cdac.util.Person;

class Employee extends Person{
	private int empid;
	private float salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee( String name, int age, int empid, float salary) {
		super( name, age );
		this.empid = empid;
		this.salary = salary;
	}
	public void printRecord( ) {
		super.printRecord();
		System.out.println("Empid	:	"+this.empid);
		System.out.println("Salary	:	"+this.salary);
	}
}
public class Program {
	public static void main(String[] args) {
		//Client Req: Sandeep, 38, 1789, 45000.50f
		Employee emp = new Employee( "Sandeep", 38, 1789, 45000.50f);
		emp.printRecord();	//Shadowing
	}
	public static void main1(String[] args) {
		Person  p = new Person("Abc", 23);
		p.printRecord();
	}
}
