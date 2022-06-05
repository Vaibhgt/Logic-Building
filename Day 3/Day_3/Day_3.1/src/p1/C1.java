package p1;

public class C1 {	//Parent/Super class
	private int a = 10;
	int b = 20;	//Default access modifier is package level private
	protected int c = 30;
	public int d = 40; 
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public void f1( ) {
		System.out.println("A	:	"+a);
		System.out.println("B	:	"+b);
		System.out.println("C	:	"+c);
		System.out.println("D	:	"+d);
	}
}
