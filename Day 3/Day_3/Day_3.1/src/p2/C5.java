package p2;

import p1.C1;

public class C5 {
	public void f5() {
		//System.out.println("A	:	"+a);	//a cannot be resolved to a variable
		C1 c1 = new C1();
		//System.out.println("A	:	"+c1.a);	//The field C1.a is not visible
		System.out.println("A	:	"+c1.getA());
		
		//System.out.println("B	:	"+b);	//b cannot be resolved to a variable
		//System.out.println("B	:	"+c1.b);	//The field C1.b is not visible
		System.out.println("B	:	"+c1.getB());
		
		//System.out.println("C	:	"+c);		//c cannot be resolved to a variable
		//System.out.println("C	:	"+c1.c);	//The field C1.c is not visible
		System.out.println("C	:	"+c1.getC());	
		
		//System.out.println("D	:	"+d);	//d cannot be resolved to a variable
		System.out.println("D	:	"+c1.d);
	}
}
