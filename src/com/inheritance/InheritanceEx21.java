//Inheritance and  Constructor execution....
package com.inheritance;

class InheritanceEx2 {
	InheritanceEx2(){
		System.out.println("Inside Parent's constructor!!");
	}
}

public class InheritanceEx21 extends InheritanceEx2{
	InheritanceEx21(){
		//super(); -even if super() is not written, compiler internally create super() and access parent's constructor.
		System.out.println("Inside Child's constructor!!");
	}
	
	public static void main(String[] args) {
		
		InheritanceEx21 i21 = new InheritanceEx21();
		
	}
}