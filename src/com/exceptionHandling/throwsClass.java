package com.exceptionHandling;

public class throwsClass {
	void m1() throws InterruptedException {
		m2();
	}
	void m2() throws InterruptedException  {
		m3();
		}
	void m3() throws InterruptedException {
		System.out.println("Start !!");
		
		//handle interrupted Exception- using try-catch block
		/*
		 * try { 
		 * Thread.sleep(5000); 
		 * } catch (InterruptedException e) { 
		 * e.printStackTrace(); 
		 * }
		 */
		
		//handle interrupted Exception- using interrupted exception
		Thread.sleep(5000);
		//Exception when thread is waiting- throws interrupted exception
		//int a = 100/0;
		System.out.println("End !!");
	}
	
	public static void main(String[] args) throws InterruptedException {
		throwsClass tc = new throwsClass();
		tc.m1();
		System.out.println("Main method !!");
	}
}

