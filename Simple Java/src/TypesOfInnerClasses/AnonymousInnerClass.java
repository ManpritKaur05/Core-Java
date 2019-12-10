package TypesOfInnerClasses;

class Tata {
	
	public void show() {
		
		System.out.println("Byeee");
	}
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		
	

	Tata obj = new Tata()
	{
		public void show() {
			
			System.out.println("Bye bye");
			
		}
	};
	obj.show(); //show method is overridden by anonymous class
	}
}
