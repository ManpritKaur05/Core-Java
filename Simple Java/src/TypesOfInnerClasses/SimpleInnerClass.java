package TypesOfInnerClasses;

class A {
	
	int rollNo = 101;
	int marks = 99;
	
	class B {
		
		public void show() {
			System.out.println("Method of inner class");
		}
	}
}

public class SimpleInnerClass {
	
	public static void main(String[] args) {
		
		A obj = new A();
		
		System.out.println(obj.marks);
		System.out.println(obj.rollNo);
		
		A.B obj2 = obj.new B(); //we are creating object of class B which is itself the member of class A and we know that we can access the member of class B by using its object.
		obj2.show(); 
		
		
	}

}
