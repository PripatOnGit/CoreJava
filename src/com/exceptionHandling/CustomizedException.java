package com.exceptionHandling;

import java.util.Scanner;

//customized exception class
class Customized extends Exception{
	public Customized(String str) {
		super(str);
	}
}

public class CustomizedException {
	
	void m1(int a) throws Customized{
		if(a<10) {
			throw new Customized("Not a valid input!!");
			}
		else {
			System.out.println("Valid input !!");
			}
	}
	
	
	public static void main(String[] args) throws Customized {
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		CustomizedException cex1 = new CustomizedException();
		cex1.m1(a);
		
	}
	
}
