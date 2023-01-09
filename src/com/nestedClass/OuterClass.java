package com.nestedClass;


//If Instance class variable name and outer class variable names are same ---use this keyword
public class OuterClass {

	int a = 10;
	int b = 20;
	
	void m4() {
		System.out.println("Inside Outer Class!!");
		System.out.println("Sum of Outer class Instance variable: "+(a+b));
	}
	
	class InnerClass{
		int a = 40;
		int b = 50;
		
		void m3(int a, int b) {
			m4();
			System.out.println("Sum Arguments: "+(a+b));
			System.out.println("Sum of Instance Variable: "+(this.a+this.b));
			System.out.println("Sum of Outer Class Instance variable: "+(OuterClass.this.a+OuterClass.this.b));
		}
	}
	
	public static void main(String[] args) {
		
		//nameless object creation approach
		new OuterClass().new InnerClass().m3(1000,2000);
		
	}
}
