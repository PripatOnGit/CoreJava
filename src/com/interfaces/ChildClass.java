package com.interfaces;

interface Interface2{
	int a = 100; //consider as final/constant variable
	void m1();
	void m2();
}

abstract class Class1 implements Interface2{
	public void m1() {
		System.out.println("Methods1..");
	}
}

abstract class Class2 extends Class1{
	public void m2() {
		System.out.println("Methods2..");
		
	}
}


public class ChildClass extends Class2 {
	public static void main(String[] args) {
		ChildClass it2 = new ChildClass();
		it2.m1();
		System.out.println("Value of a: "+a);
		it2.m2();
	}
}
