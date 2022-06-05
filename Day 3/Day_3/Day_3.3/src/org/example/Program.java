package org.example;

class A{	//Super Class
	public int x = 10;	
	public int y = 20;
	
	public void showRecord( ) {
		System.out.println("X	:	"+this.x);
		System.out.println("Y	:	"+this.y);
	}
}
class B extends A{	//Sub class 
	public int z = 30;
	public void displayRecord( ) {
		
	}
}

public class Program {
	public static void main(String[] args) {
		A a = new A( );	//Instance of super class
		System.out.println("X	:	"+a.x);
		System.out.println("Y	:	"+a.y);
		a.showRecord();
		
		//System.out.println("Z	:	"+a.z);	//z cannot be resolved or is not a field
		//a.displayRecord();	//The method displayRecord() is undefined for the type A
	}
}
