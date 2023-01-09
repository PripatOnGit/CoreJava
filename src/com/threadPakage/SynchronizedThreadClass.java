package com.threadPakage;
import java.lang.Thread;

class A{
	//one thread at a time- synchronized thread execution
	synchronized static void msg(String msg) {
	//static void msg(String msg) {
		for(int i=0;i<5;i++) {
		System.out.println("This is Class A-msg:  "+msg);
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
}
}

class Thread1 extends Thread{
	public void run() {
		A.msg("AAA");
	}
}

class Thread2 extends Thread{
	public void run() {
		A.msg("BBB");
	}
}



public class SynchronizedThreadClass {
	public static void main(String[] args) {
		//Thread scheduler will schedule Thread execution.
		new Thread1().start();
		new Thread2().start();
 }
}
