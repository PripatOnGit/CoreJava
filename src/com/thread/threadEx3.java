package com.thread;

class threadDemo14 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"-----"+i); 
		}
	}
}

public class threadEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threadDemo14 t141 = new threadDemo14();
		threadDemo14 t142 = new threadDemo14();
		t141.start();
		t142.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("Main Thread = "+i); 
		}



	}

}
