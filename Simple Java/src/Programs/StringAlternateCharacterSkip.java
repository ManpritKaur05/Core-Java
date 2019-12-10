package Programs;

public class StringAlternateCharacterSkip {
	
	public static void main(String[] args) {
		
		String str = "Geeks for Geeks";
		
		int len = str.length();
		
		int[] occ = new int[122];
		
		String ch = str.toLowerCase();
		
		for(int i=0; i<len; i++) {
			
			int temp = ch.charAt(i);
			occ[temp]++;
			
			if(occ[temp]%2 != 0) {
				System.out.print(str.charAt(i));
			}
			else {
				System.out.print("");
			}
		}
	}

}
