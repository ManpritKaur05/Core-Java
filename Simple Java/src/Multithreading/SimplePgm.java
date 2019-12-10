package Multithreading;


class A extends Thread {
	
	public void run() {
		
		int a=10;
		System.out.println("heya" + a);
		a++;
	}
}

public class SimplePgm {
	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.start();
		
		//obj.run(); //if we create this then same stack will be maintained which becomes single threading
		//In order to make multi threaded program we need to write start so that different stack is made.
	}

}
