package com.inheritance;

class InheritanceEx51{
	 InheritanceEx51(){
		 System.out.println("Parent's constructor!!");
	 }
}


public class InheritanceEx5 extends InheritanceEx51 {
	public static void main(String[] args) {
		
		//child class doen't have constructor--- so default constructor of child class is executed 
		//which executes parent's constructor assuming super()
		 InheritanceEx5 i5 = new  InheritanceEx5();
	}
}
