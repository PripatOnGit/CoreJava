// use of "this" keyword

package com.methods;

public class methodEx3 {
	//instance variable
	int a = 100;
	
	//this keyword is allowed to differentiate between instance and local varaible name
	int instanceMethod(int a) {
		int mul = a * this.a ;
		return mul;
	}
	
	//this keyword not allowed in static methods. if instance variable name and parameter name is same
	//create an object of class and use it to access instance variable of the class
	static int staticMethod(int a) {
		methodEx3 ms = new methodEx3();
		int mul = a * ms.a ;
		return mul;
	}
	
	public static void main(String args[]) {
		methodEx3 m = new methodEx3();
		int multiple1 = m.instanceMethod(500);
		System.out.println("Multiplication in instance method: "+multiple1);
		
		int multiple2 = staticMethod(200);
		System.out.println("Multiplication in static method: "+multiple2);
	}
}
