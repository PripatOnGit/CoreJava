package threadPakage;
import java .lang.Thread;

//Single child thread
class ThreadChild extends Thread{
	public void run() {
		System.out.println("Thread Child class- Thread");
	}
}

public class ThreadClassEx1 {
	public static void main(String[] args) {
		ThreadChild tc = new ThreadChild();
		tc.start();
		
		System.out.println("Main() Thread- Main");
	}
}
