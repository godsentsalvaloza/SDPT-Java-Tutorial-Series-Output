
package main;

import mathematics.*;
public class Main {
	
	public static void main(String[] args) {
		
	Arithmetic a = new Arithmetic();
	Constants c = new Constants();
	
	System.out.println(c.pi);
	System.out.println(a.square(5));
	System.out.println(a.add(10, 5));
	System.out.println(a.subtract(43, 5));
	System.out.println(a.multiply(10, 5));
	System.out.println(a.divide(10, 5));
	}
	

	
}
