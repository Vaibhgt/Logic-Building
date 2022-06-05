package org.example;
class A{
	private int x;	
	private int y;
	
	public A() {
	}
	
	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void printRecord( ) {
		System.out.println("X	:	"+this.x);
		System.out.println("Y	:	"+this.y);
	}
}

class B extends A{
	private int z;
	
	public B() {
	}
	
	public B(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public void printRecord( ) {
		super.printRecord();
		System.out.println("Z	:	"+this.z);
	}
}
public class Program {
	public static void main(String[] args) {
		A a = new B( 10, 20, 30 );	//Upcasting
		System.out.println("X	:	"+a.getX());	//OK
		System.out.println("Y	:	"+a.getY());	//OK
		//System.out.println("Z	:	"+a.getZ());	//Not OK
		
		B b = (B) a;	//Downcasting
		System.out.println("Z	:	"+b.getZ());	//Not OK
	}
	public static void main3(String[] args) {
		B b = new B( 10, 20, 30 );
		
		//A a = ( A )b;	//Upcasting	//OK
		A a = b;	//Upcasting	//OK
		System.out.println("X	:	"+a.getX());	//OK
		System.out.println("Y	:	"+a.getY());	//OK
		//System.out.println("Z	:	"+a.getZ());	//Not OK
	}
	public static void main2(String[] args) {
		B b = new B();
		b.setX(10);
		b.setY(20);
		b.setZ(30);
		b.printRecord();
	}
	public static void main1(String[] args) {
		A a = new A( );
		a.setX(10);
		a.setY(20);
		a.printRecord();
	}
}
