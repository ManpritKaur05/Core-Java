package Programs;

public class PallindromeInteger {
	
	public static void main(String[] args) {
		
		int num=454, sum=0, i=0;
		int temp=num;
		
		while(num>0) {
			i = num%10;
			sum = (sum*10)+i;
			num = num/10;
		}
		
		if(temp==sum) {
			System.out.println("number is pallindrome");
		}
		else {
			System.out.println("number is not pallindrome");
		}
	}

}
