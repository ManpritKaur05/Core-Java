package Polymorphism;

//compile time polymorphism
//it checks in compile time 


class A {
	
	//1. parameter different
	//2. type of parameter is different
	//3. sequence of parameter is different
	
	public void disp(int a) {
		System.out.println(a);
	}
	public void disp(String a, int b) {
		System.out.println(a + b);
		
	}
	public void disp(int b, String a) {
		
	}
}

public class Overloading {
	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.disp(1);
		obj.disp("Manu", 3);
		
		
	}

}
