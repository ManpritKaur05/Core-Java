package Programs;

public class SumOfPrimeNumbers {
	
	public static void main(String[] args) {
//		int sum=0;
//		
//		for(int i=2; i<=10; i++) {
//			
//			int flag=1;
//			
//			for(int j=2; j<=i/2; j++) {
//				
//				if(i%j == 0) {
//					//i is not prime
//					flag=0;
//					break;
//				}
//			}
//			
//			if(flag==1) {
//				
//				sum=sum+i;
//				//System.out.println(i);
//			}
//		}
//		
//		System.out.println(sum);
		
		int sum=0;
		
		for(int i=0; i<=100; i++) {
			
			if(isPrime(i) == true) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime(int n) {
		
		int count=0; //counting no. of factors
		
		for(int i=1; i<=n; i++) {
			
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 2){
			return true;	
		}
		else {
			return false;
		}
	}

}
