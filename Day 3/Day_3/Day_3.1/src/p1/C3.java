package p1;

public class C3 {
	public void f3() {
		//System.out.println("A	:	"+a);	//a cannot be resolved to a variable
		C1 c1 = new C1();
		//System.out.println("A	:	"+c1.a);	//The field C1.a is not visible
		System.out.println("A	:	"+c1.getA());
		
		//System.out.println("B	:	"+b);	//b cannot be resolved to a variable
		System.out.println("B	:	"+c1.b);
		
		//System.out.println("C	:	"+c);	//c cannot be resolved to a variable
		System.out.println("C	:	"+c1.c);
		
		//System.out.println("D	:	"+d);	//d cannot be resolved to a variable
		System.out.println("D	:	"+c1.d);
	}
}
