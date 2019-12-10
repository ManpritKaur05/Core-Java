package Programs;

public class DecimalToHexadecimal {
	
	public static void main(String[] args) {
		
		int num=10;
		char hexa[] = new char[100];
		
		int i=0;
		while(num>0) {
			
			int temp=0;
			temp = num%16;
			
			if(temp < 10) {
				hexa[i] = (char) (temp+48);
				i++;
			}
			else {
				hexa[i] = (char) (temp+55);
				i++;
			}
			
			num = num/16;
		}
		
		for(int j=i-1; j>=0; j--) {
			System.out.print(hexa[j]);
		}
	}

}
