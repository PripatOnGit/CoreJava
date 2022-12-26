package com.instanceBlock;

public class InstanceBlockEx4 {
	int a = 50;
	String city = "Banglore";
	
	//constructor
	InstanceBlockEx4(){
		System.out.println("This is constructor!!");
	}
	
	//Instance block
	{
		int x = 100;
		System.out.println("a: "+a);
		System.out.println("City: "+city);
		System.out.println("Inside Instance Block!!");
		
		m1();
		m2();
	}
	//Instance method
	void m1() {
		System.out.println("Inside Instance method!!");
	}
	//Static method
	static void m2() {
		System.out.println("Inside Static method!!");
	}
	//main method
	public static void main(String[] args) {
		InstanceBlockEx4 ib = new InstanceBlockEx4();
	}
	
	
}
