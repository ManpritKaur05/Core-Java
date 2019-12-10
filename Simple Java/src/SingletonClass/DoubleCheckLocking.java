package SingletonClass;

class Ab {

	static Ab obj;

	private Ab() {

		System.out.println("instance created");

	}

	static Ab inst() {

		if (obj == null) { // lazy approach

			synchronized (Ab.class) {
				
				if (obj == null) {
					
					obj = new Ab();
				}
			}
		}

		return obj;
	}
}

public class DoubleCheckLocking {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			As obj1 = As.inst();
		});

		t1.start();

		// try {
		// Thread.sleep(10);
		// } catch (Exception e) {
		//
		// }

		Thread t2 = new Thread(() -> {
			As obj2 = As.inst();
		});

		t2.start();
	}

}
