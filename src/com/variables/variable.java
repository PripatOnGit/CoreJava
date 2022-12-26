package com.variables;

public class variable {

	//INSTANCE VARIABLE 
	int i = 20;
	float k;
	
	//STATIC VARIABLE
	static int m = 200;
	public static void main(String args[]) {
		//LOCAL VARIABLE
		final int j= 100;
		
		System.out.println("Hi welcome");
		//i= 1000;
		
		//ACESS LOCAL VARIABLE
		System.out.println("new j value="+j);
		//System.out.println("new i value="+i);
		
		//ACCESS INSTANCE VARIABLE
		variable v1 = new variable();
		System.out.println("Instance variable: "+v1.i);
		System.out.println("Instance variable: "+v1.k);
		
		//ACCESS STATIC VARIABLE
		System.out.println("Static variable: "+m);
		System.out.println("Static variable: "+v1.m);
		System.out.println("Static variable: "+variable.m);
		}
	
}
