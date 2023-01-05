package com.exceptionHandling;

import java.util.Scanner;

public class throwClass {
	public void m1(int a) {
		if (a <= 100) {
			throw new ArithmeticException();
			}
		else {
			System.out.println("Valid Input !!!");
			}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter Input: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		throwClass tc = new throwClass();
		tc.m1(num);
	}
}
