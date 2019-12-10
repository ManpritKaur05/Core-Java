package Multithreading;

//class A extends Thread {
//
//	public void run() {
//
//		int a = 10;
//		System.out.println("heya" + a);
//		a++;
//	}
//}

public class MultithreadingUsingLambdaExpression {

	public static void main(String[] args) {

		// Thread obj = new Thread()
		// {
		// public void run() {
		// System.out.println("heya");
		// }
		//
		// };

		Thread obj = new Thread(() -> System.out.println("heya"));
		obj.start();

	}
}
