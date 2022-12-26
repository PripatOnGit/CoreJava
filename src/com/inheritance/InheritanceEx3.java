package com.inheritance;

class InheritanceEx32{
	InheritanceEx32(){
		System.out.println("Parent Constructor!!");
	}
}

public class InheritanceEx3 extends InheritanceEx32{
	//constructor-1
	InheritanceEx3(){
		this(10);   //constructor calling another constructor
		System.out.println("Inside Child-1 constructor!!");
	}
	//constructor-2
	InheritanceEx3(int x){
		System.out.println("Inside child-2 constructor!!");
	}
	
	public static void main(String[] args) {
		InheritanceEx3 i3 = new InheritanceEx3();
		System.out.println("---------------------------");
		InheritanceEx3 i4 = new InheritanceEx3(100);
		
	}
}
