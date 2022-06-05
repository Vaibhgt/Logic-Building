package p2;

import p1.C1;

public class C4 extends C1{	//Child / Sub class
	public void f4( ) {
		//System.out.println("A	:	"+a);	//The field C1.a is not visible
		C1 c1 = new C1();
		System.out.println("A	:	"+c1.getA());
		
		//System.out.println("B	:	"+b);	//The field C1.b is not visible
		System.out.println("B	:	"+super.getB());	//The field C1.b is not visible
		
		System.out.println("C	:	"+c);
		
		System.out.println("D	:	"+d);
	}
}
