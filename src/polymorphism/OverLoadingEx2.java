package polymorphism;

public class OverLoadingEx2 {
	OverLoadingEx2(int a){
		System.out.println("1-arg int constructor");
	}
	OverLoadingEx2(int a, int b){
		System.out.println("2-arg int,int constructor");
	}
	OverLoadingEx2(char c){
		System.out.println("1-arg char constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new OverLoadingEx2(10);
		new OverLoadingEx2(1,20);
		new OverLoadingEx2('a');
	}
}
