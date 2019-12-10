package Java8Features;

@FunctionalInterface
interface Demo1 {
	
	void abc();
	
	default void show() {
		
		System.out.println("Demo show");
	}
}

interface MyDemo {
	
	default void show() {
		
		System.out.println("MyDemo default show");
	}
}

class DemoImpl implements Demo1, MyDemo {

	public void abc() {
		
		System.out.println("In abc");
		
	}
	
	public void show() {
		MyDemo.super.show();
		//Demo1.super.show();
	}
	
	
}

public class Multiple_Inheritance_Ambiguity_Problem_In_DefaultInterface {
	
	public static void main(String[] args) {
		
		DemoImpl obj = new DemoImpl();
		obj.abc();
		obj.show();
	}

}
