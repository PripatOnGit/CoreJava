package com.threadPakage;


class ThreadOne extends Thread{
	public void run() {
		//System.out.println("Thread- One is executing !!");
		System.out.println("Inside Thread One: "+Thread.currentThread().getName());
	}
}
class ThreadTwo extends Thread{
	public void run() {
		System.out.println("Thread- Two IS EXECUTING !!	");
	}
}

class ThreadThree extends Thread{
	public void run() {
		System.out.println("Thread- Three");
	}
}


public class ThreadClassEx2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); //main thread
		
		  ThreadOne t1 = new ThreadOne();
		  t1.start();
		  System.out.println(t1.getId()); //current thread name
		  System.out.println(Thread.currentThread().getPriority()); //5 is the priority given by JVM
		  System.out.println(t1.getName()); //prints thread default name
		  System.out.println(Thread.currentThread().getName()); //current thread name
		  t1.setName("Thread-I"); // set name to thread
		  System.out.println("Thread new Name: "+t1.getName());
		  Thread.currentThread().setName("RenamedThread");
		  System.out.println(Thread.currentThread().getName());
		  System.out.println("Is Thread Active: "+t1.isAlive());
		  System.out.println("---------------");
		 
		  System.out.println("Max priority: "+Thread.MAX_PRIORITY); 
		  System.out.println("Min priority: "+Thread.MIN_PRIORITY);
		  System.out.println("Normal priority: "+Thread.NORM_PRIORITY);
		  System.out.println("Active Count: "+Thread.activeCount());
		  System.out.println("Main() Thread- Main");
		
			/*
			 * ThreadTwo t2 = new ThreadTwo(); t2.start();
			 * System.out.println(Thread.currentThread().getPriority());
			 * System.out.println(t2.getName()); t2.setName("Thread- II");
			 * System.out.println(t2.getName()); System.out.println("----------------");
			 * 
			 * System.out.println(Thread.currentThread().getName()); ThreadThree t3 = new
			 * ThreadThree(); t3.start(); System.out.println(t3.getName());
			 * t3.setName("Thread- III"); System.out.println("----------------");
			 */
		 
		
	}
}
