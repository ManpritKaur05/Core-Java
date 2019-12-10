package Programs;

public class ReverseANumber {
	
	public static void main(String[] args) {
		int num=1234;
		int i=0, sum = 0;
		
		while(num>0) {
			i = num%10;
			sum = (sum*10)+i;
			num = num/10;
		}
		
		System.out.println(sum);
	}

}
