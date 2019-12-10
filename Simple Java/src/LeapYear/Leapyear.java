package LeapYear;

//leap year is which is divisible by 4 and 400, not by 100

public class Leapyear {
	
	public static void main(String[] args) {
		
		int leap = 2019;
		
		if (leap%4==0 && leap%100!=0 || leap%400==0) {
			
			System.out.println("It is a leap Year");
		}
		else {
			
			System.out.println("It is not a leap year");
		}
	}

}
