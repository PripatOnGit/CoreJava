package com.exceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		
		//Arithmetic exception
		int a = 100;
		try {
			int x = a/0;
		}
		catch(ArithmeticException ae){
			System.out.println("Not valid!!");
			System.out.println(ae);
			System.out.println(ae.getMessage());
		}
		finally {
			System.out.println("End of Program!!");
		}
		
		System.out.println("-------------------------");
		//ArrayOutOfBoundException
		int arr[]  = new int[5];
		try {
			System.out.println(arr[10]);;
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Index out of bound!!");
			System.out.println(ae);
		}
		finally {
			System.out.println("End of Program!!");
		}
		System.out.println("-------------------------");
		
		
		//NullPointerException
		String name = null;
		try {
			System.out.println(name.length());;
		}
		catch(NullPointerException ae){
			System.out.println("Null Pointer exception!!");
			System.out.println(ae);
		}
		finally {
			System.out.println("End of Program!!");
		}
	}
}
