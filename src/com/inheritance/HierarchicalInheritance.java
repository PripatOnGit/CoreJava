package com.inheritance;

class Organisations{
	Organisations(){
		System.out.println("Organisation's Constructor!");
	}
}
class Companys extends Organisations{
	Companys(){
		System.out.println("Company's Constructor!");
	}
}

class Employees extends Organisations{
	Employees() {
		System.out.println("Employee's Constructor!");
	}
}

public class HierarchicalInheritance extends Organisations {
	public static void main(String[] args) {
		HierarchicalInheritance ml = new HierarchicalInheritance();
		System.out.println("-------------------------------");
		Companys c = new Companys();
	}
}
