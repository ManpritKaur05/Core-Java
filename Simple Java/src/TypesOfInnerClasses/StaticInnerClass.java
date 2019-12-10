package TypesOfInnerClasses;

class Ad {
	
	static int marks = 100;
	
	static class B {
		
		public void show() {
			
			System.out.println("Hello" + marks); //static method can only call static members
		}
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
		
		System.out.println(Ad.marks);
		
		Ad.B obj = new Ad.B();
		
		obj.show();
		
		
	}

}
