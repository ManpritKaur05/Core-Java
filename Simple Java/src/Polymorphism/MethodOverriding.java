package Polymorphism;

//run-time polymorphism
//dynamic method dispatch - if u make parent's reference and make child's object then u can only access all the methods of parent class as well as the override method of child class

class Q {
	
	public void disp() {
		System.out.println("Hello");
	}
	
}

class R extends Q {
	
	public void disp() {
		System.out.println("Heya");
	}
	
	public void show() {
		System.out.println("Byyeee");
	}
	
}

//interface T {
//
//	void disp();
//}
//
//class Y implements T {
//
//	public void disp() {
//		System.out.println("Heya");
//	}
//
//	public void show() {
//		System.out.println("Hello");
//	}
//}

public class MethodOverriding {

	public static void main(String[] args) {

//		 Q obj = new Q();
//		 obj.disp();
//		
//		 R obj1 = new R();
//		 obj1.disp();
		
		 Q obj2 = new R(); //method overriding or dynamic method dispatch
		 obj2.disp();
		 obj2.show();

//		T obj = new Y();
//		obj.disp();
//		obj.show();
	}

}
