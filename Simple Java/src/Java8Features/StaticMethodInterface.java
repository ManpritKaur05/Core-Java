package Java8Features;

interface Ah {

	int a = 10; // the scope of this variable is always final

	static void show() {
		System.out.println("Henlo tucker");
	}

	public void dispp();

}

class Bh implements Ah {

	public void dispp() {

		int b = 5;
		System.out.println(b + a);
		System.out.println("Tucker is a sweet dog");
	}

}

public class StaticMethodInterface {

	public static void main(String[] args) {

		Ah.show();
		Bh obj = new Bh();

		obj.dispp();
	}

}
