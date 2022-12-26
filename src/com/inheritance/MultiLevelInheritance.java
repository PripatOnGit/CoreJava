package com.inheritance;


class Organisation{
	Organisation(){
		System.out.println("Organisation's Constructor!");
	}
}
class Company extends Organisation{
	Company(){
		System.out.println("Company's Constructor!");
	}
}

class Employee extends Company{
	Employee() {
		System.out.println("Employee's Constructor!");
	}
}

public class MultiLevelInheritance extends Employee {
	public static void main(String[] args) {
		MultiLevelInheritance ml = new MultiLevelInheritance();
		System.out.println("-------------------------------");
		Company c = new Company();
	}
}
