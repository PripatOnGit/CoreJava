package com.abstraction;

abstract class AbstractEx12 {
	abstract void m2();
	void m1() {
		System.out.println("Inside Parent's class!!");
		}
	}


public class AbstractEx1 extends AbstractEx12 {
	void m2() {System.out.println("Inside Child class-- Abstract method m2() implemented in child class!!!");} 
	void m1() {System.out.println("child class!!!");}
	public static void main(String[] args) {
	 
	AbstractEx1 aex1 = new AbstractEx1(); //child class object
	aex1.m2();
	aex1.m1();
	//AbstractEx1 ab1 = new AbstractEx1();
	//can access abstract method on parent class reference and child class object
	//ab1.m1();
	}
}