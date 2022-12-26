//multiple objects of class
package com.constructor;

public class constructorEx2 {
	String name;
	int age;
	double salary;
	

	//instance variable and constructor parameters(local variable) has same name---use 'this' keyword
	public constructorEx2(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;	
		}
	
	void display() {
		System.out.println("Name of employee "+name+" ,Age of employee "+age+" ,Salary "+salary);
	}
	
	public static void main(String[] args) {
		constructorEx2 cs2 = new constructorEx2("Priya", 30, 400.0);
		cs2.display();
	} 
	
	
}
