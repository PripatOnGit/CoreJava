//Inheritance

package com.inheritance;

class A{
	//instance variables of parent class
	int i = 10;
	
	//Static variable of parent class
	static int a = 20;
	
	//instance method of parent class
	void m1() {
		System.out.println("This is m1() in class A");
	}
	void m3() {
		System.out.println("This is Method m3() inside parent class");
	}
}

class InheritanceEx1 extends A{
	//instance variable of child class
	int i = 50;
	
	static int a = 200;
	//method inside child class with same name as parent's class-----overrides the parent's m1()
	void m1() {
		System.out.println("This is m1() in child class B");
	}
	//instance method of child class
	void m2() {
		System.out.println(super.i); //Access perent's instance variable with 'Super' keyword
		System.out.println(this.i);  //Access child's own instance variable with 'this' keyword if both names are same.
		super.m1(); //Access parent's method with 'super' class
		this.m3();
		super.m3();
	}
	
	void m3() {
		System.out.println("This is Method m3() inside child class");
	}
	
	static void m4(InheritanceEx1 a1) {
		//System.out.println(a);
		System.out.println(a1.i);
		System.out.println(a1.a);
		System.out.println(a);
		//System.out.println(i);
	}
	//main method
	public static void main(String[] args) {
		InheritanceEx1 b = new InheritanceEx1();
		///b.m1();
		//b.m2();
		//b.m3();
		m4(b);
	}
}
