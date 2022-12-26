
//flow of instance block/static block/constructor etc
package com.inheritance;

class InheritanceEx71{
	//Parent's Static Block
	static{
		System.out.println("Parent's Static block");
	}
	
	//Parent's Instance block
	{
		System.out.println("Parent's Instance Block");
	}
	
	InheritanceEx71(){
		System.out.println("Parent's Constructor!");
	}
	
}


public class InheritanceEx7 extends InheritanceEx71 {
	   //Child Static Block
		static{
			System.out.println("Child's Static block");
		}
		
		//child Instance block
		{
			System.out.println("Child's Instance Block");
		}
		
		//child's Constructor
		InheritanceEx7(){
			System.out.println("Child's Constructor!");
		}
		
		//main()
		public static void main(String[] args) {
			InheritanceEx7 i7 = new  InheritanceEx7();
		}
}
