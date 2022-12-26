package com.polymorphism;

public class MethodOverloadingEx1 {
	void m1() {
		System.out.println("0-arg Method");
	}
	void m1(int a) {
		System.out.println("1-arg int Method");
	}
	void m1(int a, int b) {
		System.out.println("2-arg int int Method");
	}
	void m1(char c) {
		System.out.println("1-arg char Method");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingEx1 Ex1 = new MethodOverloadingEx1();
		Ex1.m1();
		Ex1.m1(10);
		Ex1.m1(10, 20);
		Ex1.m1('a'); 
		
	}
}
