package Programs;

public class ArmstringNo {

	public static void main(String[] args) {
		
		int num=153, i=0, c=0;
		int temp=num;
		
		while(num>0) {
			
			i = num%10;
			num = num/10;
			c = c + (i*i*i);
		}
		
		if(temp==c) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
	}
}
