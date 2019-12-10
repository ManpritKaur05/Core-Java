package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {

	AtomicInteger count = new AtomicInteger();

	public synchronized void increment() {

		count.incrementAndGet();

	}
}

public class ThreadSafety {

	public static void main(String[] args) throws InterruptedException {

		Counter obj = new Counter();

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 100; i++) {
					obj.increment();
				}
			}

		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 100; i++) {
					obj.increment();
				}
			}

		};
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(obj.count);
	}

}
