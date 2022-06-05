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
		System.out.println("Z	:	"+z);
	}
}

public class Program {
	public static void main(String[] args) {
		B b = new B( );	//Instance of sub class
		System.out.println("X	:	"+b.x);
		System.out.println("Y	:	"+b.y);
		System.out.println("Z	:	"+b.z);
		
		b.showRecord();
		
		b.displayRecord();
	}
}
