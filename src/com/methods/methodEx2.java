//Return type for methods are mandatory
package com.methods;

public class methodEx2 {
	
	//without argument without return values-- just print statements
	void meet() {
		System.out.println("we have meeting!!!");
	}
	
	//without argument with return values
	String message() 
	{
		return "Hello World";
	}
	
	//with arguments without return values
	void greet(String msg) {
		System.out.println("Good Morning! "+msg);
	}
	
	//with argument with return type
	int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public static void main(String[] args) {
		methodEx2 m2 = new methodEx2();
		int sum = m2.add(10, 20);
		System.out.println("Sum of numbers: "+sum);
		
		String msg = m2.message();
		System.out.println(msg+"!!..........Good Morning!!");
		
		m2.greet("Welcome");
		}
	
}






