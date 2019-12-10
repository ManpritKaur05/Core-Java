package SwitchStatement;

// Enum is a special kind of java class which is a collection of constants, methods, etc.
// We can create enum outside or inside the class.

enum mobile {

	APPLE,SAMSUNG(10),ONEPLUS; // methods and constants
	
	int price; // variable
	
	
	
	mobile() 
	{
		price =80;
		
	}
	
	

	mobile(int p) {
		this.price = p;
	}



	public int getPrice() {
		return price;
	}

	




	
	}

public class UseofEnum {
		
		public static void main(String[] args) {
			
			mobile m = mobile.apple();
			
			switch(m) {
			
			case apple() : 
				System.out.println("Apple method is selected");
				break;
				
			case nokia :
				System.out.println("nokia constant is selected");
			
			default:
				System.out.println("nothing");
				
			}
			
		}
	}
