package com.threadPakage;

class DaemonThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("DAEMON THREAD");
			try {
			Thread.sleep(1000);
			}catch (InterruptedException ie) {
				// TODO: handle exception
				ie.printStackTrace(); 
			}
			}
	}
	
}

public class ThreadEx extends Thread {
	public static void main(String[] args) {
		DaemonThread tc = new DaemonThread();
		tc.setDaemon(true); 
		tc.start();
		
		for(int i=0; i<=5; i++) {
		System.out.println("Main() Thread- Main");
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException ie){
			ie.printStackTrace();
			}
		}
	}
}

