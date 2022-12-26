//Use of constructors

package com.constructor;

public class constructorEx1 {

	//same name as class name--no explicit return type--no access specifier allowed except 'public'
	//no-argument constructor
	public constructorEx1() {
		System.out.println("This is no parameter constructor!!");
	}
	public constructorEx1(int x) {
		System.out.println("This is parameter constructor:   "+x);
	}
	public constructorEx1(int x, int y) {
		System.out.println("This is parameter constructor:  "+x+" "+y);
	}
	
	public static void main(String[] args) {
		constructorEx1 const1 = new constructorEx1(); //Named approach object creation
		constructorEx1 const2 = new constructorEx1(10);
		constructorEx1 const3 = new constructorEx1(10, 20);
	}
}
