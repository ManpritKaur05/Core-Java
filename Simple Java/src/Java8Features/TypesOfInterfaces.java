package Java8Features;

//Before java 8 we have 3 types of interfaces:
//normal interface - it can have more than 1 method
//single abstract normal interface (SAM interface) - only having single method
//marker interface - no methods are there e.g serialization

//serialization - saving the object state.

//Java 8 onwards
//normal interface - it can have more than 1 method
//single abstract normal interface (SAM interface) or functional interface having lambda expression - only having single method
//marker interface - no methods are there e.g serialization

@FunctionalInterface
interface Abcd {

	void show();
	// void a();
}

public class TypesOfInterfaces {

	public static void main(String[] args) {

		// Abcd obj = new Abcd()
		// {
		// public void show() {
		// System.out.println("hello");
		// }
		// };
		// obj.show();
		Abcd obj = ()->System.out.println("hello");
		obj.show();
	}

}
