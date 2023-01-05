package com.encapsulation;

public class EncapsulationEx {
	public static void main(String[] args) {
		//object id modal class
		EncapsulationBean eb1 = new EncapsulationBean();
		
		//set variables
		eb1.setId(100);
		eb1.setName("Prianka");
		
		
		//get Variables
		if (eb1.getId() > 0) {
		System.out.println(eb1.getId()+"  "+eb1.getName());
		}
		else {
			System.out.println("Inavlaid Id");
		}
		
	}
}
