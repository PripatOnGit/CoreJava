package com.instanceBlock;

public class InstanceBlockEx2 {

	int a;
	String name;
	
	//instance block --instance variables are initialized inside Instance block
	{
		a = 50;
		name = "Priyanka";
	}
	//Constructor
	InstanceBlockEx2(){
		System.out.println("A: "+a+"\n"+"Name: "+name);
	}
	public static void main(String[] args) {
		InstanceBlockEx2 ib = new InstanceBlockEx2();
	}
}
