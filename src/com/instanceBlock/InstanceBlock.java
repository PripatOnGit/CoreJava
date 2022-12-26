package com.instanceBlock;

public class InstanceBlock {
	
	
	
	//Instance block
	{
		System.out.println("Instance Block");
	}
	
	//constructor
	public InstanceBlock() {
		System.out.println("Constructor");
	}
	
	//main method
	public static void main(String[] args) {
		InstanceBlock ib = new InstanceBlock();
	}
	
	
}
