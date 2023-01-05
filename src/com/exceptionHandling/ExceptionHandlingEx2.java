package com.exceptionHandling;

public class ExceptionHandlingEx2 {
	public static void main(String[] args) {
		
		//one try block and multiple catch block
		try {
			int a = 100/0;
			}
		catch(ArithmeticException ae) { 
				System.out.println(ae);
				}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
			}
		catch(NullPointerException ae) {
			System.out.println(ae);
			}
		
		//parent class of exception handling- will handle all checked and unchecked excepetions
		catch(Exception ae) {
			System.out.println(ae);
		}
		finally {
			System.out.println("Finally block!!");
		}
		
	}
}
