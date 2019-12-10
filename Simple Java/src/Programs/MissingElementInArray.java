package Programs;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,7};
		int total = (arr.length+1) * (arr.length+2) / 2;

		
		for(int i=0; i<arr.length; i++)
		{
			total=total-arr[i];
			
		}
		

		System.out.println(total);
	}

}
