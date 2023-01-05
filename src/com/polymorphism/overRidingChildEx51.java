package com.polymorphism;


//Rule 5: Parent reference Variable Child Class Object Child Reference Variable Parent Class Object
//Method Hiding
//Not possible to override the static methods in java because static methods are bound with class

class Parent51{
	static void m1() {
		System.out.println("Parent M1 Method...");
	}
}

public class overRidingChildEx51 extends Parent51{
	 static void m1() {
		System.out.println("Child M1 Method...");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overRidingChildEx51 c55 = new overRidingChildEx51();
		c55.m1();
		
		
		Parent51 P51 = new overRidingChildEx51(); //parent var ref and child class object
		P51.m1();   //this method wont get override as it is static method
		
	//overRidingChildEx51 c52 = (overRidingChildEx51) new Parent51();
		//c52.m1();
		
		
		

	}

}
