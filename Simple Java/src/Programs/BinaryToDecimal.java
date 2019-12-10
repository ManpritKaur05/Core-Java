package Programs;

public class BinaryToDecimal {

	public static int binary(int a) {
		int num=a;
		int sum=0;
		int n=0;
		int b = 1;
		
		while(num>0) {
			int i=num%10;
//			sum = (int) (sum+i*Math.pow(2, n));
			num=num/10;
			sum = sum + i*b;
			b = b * 2;
			//n++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int num = binary(1110);
		System.out.println(num);
	}
}
