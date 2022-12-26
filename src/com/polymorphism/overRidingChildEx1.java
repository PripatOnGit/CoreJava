// Rue 1: Overridden method signature and overriding method signature must be same

package com.polymorphism;

class Parent1{
	void m1() {  // OVERRIDDEN METHOD
		System.out.println("M1 Method- OVERRIDDEN METHOD");
	}
}

public class overRidingChildEx1 extends Parent1 {
	
	void m1() {  // OVERRIDING METHOD
		System.out.println("M1 Method- OVERRIDING METHOD");
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overRidingChildEx1 om1 = new overRidingChildEx1();
		//new overRidingChildEx1().m1();
		//new Parent1().m1();
		om1.m1();
		
		}

}