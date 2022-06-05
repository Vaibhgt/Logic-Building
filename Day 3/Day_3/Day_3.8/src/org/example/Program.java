package org.example;

import java.util.Scanner;
abstract class Shape{
	protected float area;
	public abstract void acceptRecord();
	
	public abstract void calculateArea( ) ;
	
	public final void printRecord(  ) {
		System.out.println("Area	:	"+this.area);
	}
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public void acceptRecord( /* Rectangle this = rect*/ ) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Length	:	");
			this.length = sc.nextFloat();
			System.out.print("Breadth	:	");
			this.breadth = sc.nextFloat();
		
	}
	public void calculateArea( /* Rectangle this = rect*/ ) {
		this.area = this.length * this.breadth;
	}
}
class Circle extends Shape{
	private float radius;
	public void acceptRecord( /* Circle this = c*/ ) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Radius	:	");
			this.radius = sc.nextFloat();
		
	}
	public void calculateArea( /* Circle this = c*/ ) {
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
	}
}
class ShapeTest{
	private Shape shape;	//null
	public void setShape(Shape shape) {	//Upcasting
		this.shape = shape;
	}
	public void acceptRecord( ) {
		if( this.shape != null ) {
			this.shape.acceptRecord();	//Dynamic Method Dispatch
			this.shape.calculateArea();	//Dynamic Method Dispatch
		}
	}
	public void printRecord( ) {
		if( this.shape != null ) {
			this.shape.printRecord();
		}
	}
}
public class Program {
	public static void main(String[] args) {
		ShapeTest test = new ShapeTest();
		//test.setShape( new Rectangle() );
		test.setShape( new Circle() );
		test.acceptRecord();
		test.printRecord();
	}
}
