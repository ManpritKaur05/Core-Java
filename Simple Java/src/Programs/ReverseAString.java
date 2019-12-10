package Programs;

public class ReverseAString {

	public static void main(String[] args) {
		
		String name = "hello";
		String reverse ="";

		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
	}
}
