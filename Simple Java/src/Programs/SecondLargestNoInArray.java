package Programs;

public class SecondLargestNoInArray {
	
	public static void main(String[] args) {
		
		int arr[] = {12,56,34,90,66,80,11};
		int n = arr.length;
		print2Largest(arr, n);
	}
	
	public static void print2Largest(int arr[], int arr_size) {
		
		int first, second;
		
		if(arr_size < 2) {
			System.out.println("invalid array");
		}
		
		first=second=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second && arr[i]!=first) {
				second = arr[i];
			}
			
			else
				System.out.println(second);
		}
	}

}
