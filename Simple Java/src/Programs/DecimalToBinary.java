package Programs;

public class DecimalToBinary {

	public static void main(String[] args) {
		
//		int n=4;
//		String a="";
//		int i;
//		
//		while(n>0)
//		{
//			i=n%2;
//			a=a+i;
//			n=n/2;
//		}
//		
//		System.out.println(a);
		
		int n=14;
		decToBinary(n);
	}
	
	public static void decToBinary(int n) {
		
		int[] binaryNum = new int[1000];
		int i=0;
		
		while(n > 0) {
			binaryNum[i] = n%2;
			n = n/2;
			i++;
		}
		
		for(int j=i-1; j>=0; j--) {
			System.out.print(binaryNum[j]);
		}
	}
}
