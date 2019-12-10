package SwitchStatement;

public class Printingmonth {
	
	public static void main(String[] args) {
		
		int month=1;
		
		switch(month){
		
		case 1:
			System.out.println("January");
			//if we don't write break, it will print the next case also.
			break; 
			
		case 2:
			System.out.println("February");
			break;
			
		//default will execute when no case matches
		default:
			System.out.println("There is no match case");
		}
	}
}