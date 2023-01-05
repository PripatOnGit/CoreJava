package com.encapsulation;

public class EncapsulationBean {

	//declare instance variable
	private int id;
	private String name;
	
	//create getter and setters method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id > 0) {
			this.id = id;
			}
			else {
				System.out.println("Inavlaid Id");
			}
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
