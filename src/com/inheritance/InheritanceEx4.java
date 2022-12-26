package com.inheritance;


//class with no constructor
class InheritanceEx41 {
	//class has no constructor---by default 0-org/ empty/ default constructor is executed!
}

public class InheritanceEx4 extends InheritanceEx41{
	
	InheritanceEx4(){
	//super();
	  System.out.println("Inside Child-1 constructor!!");
	}
	
	
	public static void main(String[] args) {
		InheritanceEx4 i3 = new InheritanceEx4();
	}
}