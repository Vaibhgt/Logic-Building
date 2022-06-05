package p1;

public class C2 extends C1{	//Child / Sub class
	public void f2( ) {
		//System.out.println("A	:	"+a);	//The field C1.a is not visible
		System.out.println("A	:	"+super.getA());
		System.out.println("B	:	"+b);
		System.out.println("C	:	"+c);
		System.out.println("D	:	"+d);
	}
}
