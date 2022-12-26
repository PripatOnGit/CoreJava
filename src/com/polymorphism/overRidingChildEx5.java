package com.polymorphism;

//Rule 5: Parent reference Variable Child Class Object Child Reference Variable Parent Class Object

class Parent5{
	void m1() {
		System.out.println("Parent M1 Method...");
	}
	void m3() {
		System.out.println("Parent M3 Method...");
	}
}

public class overRidingChildEx5 extends Parent5{
	void m1() {
		System.out.println("Child M1 Method...");
	}
	void m2() {
		System.out.println("Child M2 Method...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent5 P5 = new Parent5();
		P5.m1();
		P5.m3();
		System.out.println("..........................");
		overRidingChildEx5 C5 = new overRidingChildEx5();
	    C5.m1();
	    C5.m2();
	    C5.m3();
	    System.out.println("..........................");
		//overRidingChildEx5 c51 = (overRidingChildEx5) new Parent5() ;  
		//c51.m1();
		//c51.m2();
		//c51.m3();
		System.out.println("..........................");	
		Parent5 Pa = new overRidingChildEx5();  // child class object is created
		
		Pa.m1();
//		((overRidingChildEx5) Pa).m2(); 
	    ((overRidingChildEx5) Pa). m2();       	                         
		Pa.m3(); 
		 
		

	}

}

