
//Assignmemt ---2
package com.constructor;

public class employeeEx2 {
	
	//constructor
	public employeeEx2() {
		System.out.println("Employee Details!!");
	}
	
	//Instance Method
	void showDetails() {
		System.out.println("This is instance method!");
	}
	//Static method
	static void displayDetails() {
		System.out.println("This is static method!!");
	} 
	
	public static void main(String[] args) {
		employeeEx2 emp = new employeeEx2();
		emp.showDetails();
		displayDetails();
	}

	
}
