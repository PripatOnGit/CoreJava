package com.interfaces;

interface Interface1{
	void m1();
	void m2();
}

public class InterfaceEx1 implements Interface1 {
	
	public void m1() {
		System.out.println("Method1");
	}
    public void m2() {
    	System.out.println("Method2");
	}
	
	public static void main(String[] args) {
		InterfaceEx1 it1 = new InterfaceEx1();
		it1.m1();
		it1.m2();
	}
}
