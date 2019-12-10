package SingletonClass;

//synchronization - in multithreading programming when two or more threads try to use same data member at same time then in order to make the program thread safe we use synchronization

class As {

	static As obj;

	private As() {

		System.out.println("instance created");

	}

	static synchronized As inst() {

		if (obj == null) { //lazy approach

			obj = new As();
		}

		return obj;
	}
}

public class SingletonDesignPatternUsingSynchronization {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {

				As obj1 = As.inst();

			}

		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {

				As obj2 = As.inst();

			}

		};

		t2.start();

	}

}
