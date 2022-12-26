package com.methods;

public class method {

	int a = 100; //Instance Variable
	static int b = 200; //Static Variable
	
	
	//Instance Method
	void instanceMethod() {
		int c = 300;
		
		//Object of class
		method m1 = new method();
		
		
		System.out.println("Local variable c inside instance method: "+c);
		System.out.println("Instance Variable a inside instance method: "+a);
		System.out.println("Static Variable b inside instance method:  "+b);
		System.out.println("Static Variable b inside instance method:  "+m1.b);
		System.out.println("Static Variable b inside instance method:  "+method.b);
	}
	
	//Static Method
	static void staticMethod() {
		int c = 500;
		
		//Object of class
		method m2 = new method();
		
		
		System.out.println("Local variable c inside static method: "+c);
		System.out.println("Instance Variable a inside static method: "+m2.a);
		System.out.println("Static Variable b inside static method:  "+b);
		System.out.println("Static Variable b inside static method:  "+m2.b);
		System.out.println("Static Variable b inside static method:  "+method.b);
	}
	
	//main method
	public static void main(String[] args) {
		method obj1 = new method();
		obj1.instanceMethod();
		
		System.out.println("------------------------------------------------------");
		obj1.staticMethod();
		staticMethod();
		method.staticMethod();
		
	}
	
}
