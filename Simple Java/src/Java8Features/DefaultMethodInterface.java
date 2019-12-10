package Java8Features;

//Functional interface can only have 1 normal method but can have more than 1 default methods

@FunctionalInterface
interface jh {

	void show();

	default void disp() {

		System.out.println("heyAA");
	}
	
	static void a1() {
		
	}
	static void b1() {
		
	}
}

//class Jk implements jh {
//
//	public void show() {
//
//		System.out.println("Hola");
//	}
////
////	public void disp() {
////
////		System.out.println("hey");
////	}
//}

public class DefaultMethodInterface {

	public static void main(String[] args) {
		
		jh obj = ()->System.out.println("Henloo");
		obj.show();
		obj.disp();
		
		
	}

}
