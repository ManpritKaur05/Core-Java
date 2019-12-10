package Programs;

public class PallindromeString {

	public static void main(String[] args) {

		String name = "MADAM";
		String reverse ="";

		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);
		}
		if(reverse.equals(name)) {
			System.out.println("string is pallindrome");
		}
		else
		{
			System.out.println("string is not pallindrome");
		}
	}
}
