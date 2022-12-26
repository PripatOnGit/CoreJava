//Rule 2: Overridden method return type and overriding method return type must be same at primitive level

package com.polymorphism;
class Parent2{
	float m1() {  // OVERRIDDEN METHOD
		System.out.println("M1 Method- OVERRIDDEN METHOD");
		return 10.5f;
	}
}

public class overRidingChildEx2 extends Parent2{
	float m1() {  // OVERRIDDEN METHOD
		System.out.println("M1 Method- OVERRIDING METHOD");
		return 50.05f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   new overRidingChildEx2().m1();
		 
		
	}

}
