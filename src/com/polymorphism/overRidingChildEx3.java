package com.polymorphism;

class Animal{}

class Elephant extends Animal{}

class Parent3{
	Animal m1() {  // OVERRIDDEN METHOD
		System.out.println("M1 Method- OVERRIDDEN METHOD");
		return new Animal();
	}
}

public class overRidingChildEx3 extends Parent3{
	
	Elephant m1() {  // OVERRIDDEN METHOD
		System.out.println("M1 Method- OVERRIDING METHOD");
		return new Elephant();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//overRidingChildEx3 m3 = new overRidingChildEx3();
		//m3.m1();
		//new Parent3().m1();
		new overRidingChildEx3().m1();
	}

}
