package com.threadPakage;


class RunnableThreadEx implements Runnable{
	public void run() {
		for(int i=0; i<5;i++) {
		System.out.println("Inside User defined Thread Class !!");
		}
	}
}

public class ThreadEx4 {
	public static void main(String[] args) {
		RunnableThreadEx rt = new RunnableThreadEx();
		Thread t1 = new Thread(rt);
		t1.start();
		for(int i=0; i<3;i++) {
		System.out.println("Main Thread");
		}
	}
}
