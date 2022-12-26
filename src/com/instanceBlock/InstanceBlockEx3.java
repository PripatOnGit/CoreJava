//Multiple Instance block and constructors calling another constructor

package com.instanceBlock;

public class InstanceBlockEx3 {
	//instance block-1
	{
		System.out.println("instance block-1");
	}
	//instance block-2
	{
		System.out.println("instance block-2");
	}
	//instance block-3
	{
		System.out.println("instance block-3");
	}
	//constructor-1
	InstanceBlockEx3(){
		this(10);
		System.out.println("Constructor-1");
	}
	//constructor-2
	InstanceBlockEx3(int x){
		this(10, 20);
		System.out.println("Constructor-2");
	}
	//constructor-3
	InstanceBlockEx3(int x, int y){
		System.out.println("Constructor-3");
	}
	
	
	//main method
	public static void main(String[] args) {
		InstanceBlockEx3 ib1 = new InstanceBlockEx3();
		System.out.println("--------------------------");
		InstanceBlockEx3 ib2 = new InstanceBlockEx3();
		System.out.println("--------------------------");
		InstanceBlockEx3 ib3 = new InstanceBlockEx3();
	}
	
}
