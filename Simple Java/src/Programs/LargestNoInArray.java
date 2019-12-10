package Programs;

public class LargestNoInArray {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 45, 83, 90, 11, 20};
		
		int max=arr[0];
		
		for(int i=1; i<=arr.length-1; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element in array: " + max);
	}
}
