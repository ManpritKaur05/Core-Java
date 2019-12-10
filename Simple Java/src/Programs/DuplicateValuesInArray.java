package Programs;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,4,5,7,7};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j] && i!=j) {
					//System.out.print("Duplicate numbers: " + arr[j]);
					break;
				} 
				else {
				System.out.print(arr[i]);
				break;
				}
				
			}
			

		}
		
		
		
	}
}
