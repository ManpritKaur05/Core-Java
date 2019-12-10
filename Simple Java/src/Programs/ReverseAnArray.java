package Programs;

public class ReverseAnArray {

	public static void reverse(String a[], int n) 
	{
		String b[] = new String[n];
		int j=n;
		
		for(int i=0; i<n; i++) {
			
			b[j-1] = a[i];
			j--;
		}
		
		System.out.print("reversed array: ");
		for(int k=0; k<n; k++) {
			System.out.print(b[k] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		String arr[] = {"this", "is", "my", "car"};
		System.out.println("length of array: " + arr.length);
		reverse(arr, arr.length);
	}
}
