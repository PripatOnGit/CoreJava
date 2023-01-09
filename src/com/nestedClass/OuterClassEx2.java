package com.nestedClass;

import com.nestedClass.OuterClass.InnerClass;

public class OuterClassEx2 {
	int a = 10;
	int b = 20;
	
	void m1() {
		System.out.println("Inside Outer Class!!");
		System.out.println("Sum of Outer class Instance variable: "+(a+b));
	}
	
	class InnerClass2{
		int c = 40;
		int d = 50;
		
		void m2() {
			m1();
			int sum = a+ b+ c+ d;
			System.out.println("Sum: "+sum);
		}
	}
	
	public static void main(String[] args) {
		OuterClassEx2 oc = new OuterClassEx2();
		oc.m1();
		
		//Access inner class methods and variables
		//OuterClass.InnerClass ic = oc.new InnerClass();
		//ic.m2();
		
		//nameless object creation approach
		new OuterClassEx2().new InnerClass2().m2();
		
	}
}
