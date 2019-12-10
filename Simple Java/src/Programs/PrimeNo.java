package Programs;

public class PrimeNo {

	public static void main(String[] args) {

		int num = 4, flag = 0, m=0, i;
		//m=num/2;

		if (num == 0 && num == 1) {

			System.out.println("number is not prime");
		} 
		else {
			
			for(i=2; i<=num/2; i++) {
				if(num%i == 0) {
					
					System.out.println("number is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("number is prime");
			}
			
		}
	}
}
