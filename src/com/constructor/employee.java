
//Constructor assignment- 1

package com.constructor;

public class employee {
	
	//instance variable
	int id;
	String name;
	double salary;
	
	//static variable
	static String country;
	

	//static block
	/*static {
		country = "India";
	}*/
	
	//constructor
	public employee(int id, String name, double salary) {
		//same name for instance and constructor parameters(local variables to constructors)--use of this keyword.
		this.id = id;
		this.name = name;
		this.salary = salary;
		//country = "India";   //static variable can be initialized in constructor.
	}	

	//instance method
	void showEmp() {
		System.out.println("Employee id: "+id+"\n"+"Name: "+name+"\n"+"Salary: "+salary+"\n"+"Country: "+country);
	}
	//static method using instance and static variables
	static void showSalary(employee emp) {
		System.out.println("Employee id: "+emp.id+"\n"+"Name: "+emp.name+"\n"+"Salary: "+emp.salary+"\n"+"Country: "+country);
	}
	
	//static method
    static void showSal() {
		System.out.println("In static method!!");
		System.out.println("country is: "+country);
	}
	
	
	//main method
	public static void main(String[] args) {
		employee emp1 = new employee(1, "Priyanka", 100.0);
		emp1.showEmp();
		System.out.println("---------------");
		employee.country = "NZ";
		employee emp2 = new employee(2, "Abhijeet", 200.0);
		emp1.showEmp();
		System.out.println("---------------");
		emp2.showEmp();
		System.out.println("---------------");
		showSalary(emp2);
		employee.country = "AUS";
		showSal();
	}
}

