package com.inheritance;

class InheritanceEx61{
	InheritanceEx61(int x){
		 System.out.println("Parent's constructor!!");
	 }
}


public class InheritanceEx6 extends InheritanceEx61 {
	
	InheritanceEx6(){
		//super() - this will throw error bcoz signature mismatched!!
		//when super() calls parent's constructor it should match with parent's constructor signature.. (argument wise)-- otherwise it will throw an error
		super(10);
		 System.out.println("child's constructor!!");
	 }
	public static void main(String[] args) {
		InheritanceEx6 i6 = new  InheritanceEx6();
	}
}