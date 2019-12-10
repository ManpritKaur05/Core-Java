package TypesOfInnerClasses;

class Af {
	
	public void show() {
		
		class Bg {
			
			public void dis() {
				
				System.out.println("hi");
			}
		}
		Bg obj = new Bg();
		obj.dis();
	}
}

public class LocalInnerClass {
	
	public static void main(String[] args) {
		
		Af obj2 = new Af();
		obj2.show();
		
		
	}

}
