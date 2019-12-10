package Loops;

public class Diamond {

	public static void main(String[] args) {

		int num = 3;

		/*
		 * for (int m = 1; m <= 2; m++) { for (int n = 2; n >= m; n--) {
		 * System.out.print("*"); } System.out.println(""); }
		 */

		for (int i = 1; i <= num; i++) {

			for (int j = 2; j >= i; j--) {

				System.out.print(" ");

			}
			for (int m = 1; m <= i * 2 - 1; m++) {
				
				System.out.print("*");
			}
			
			System.out.println("");
		}

		for (int k = 1; k < num; k++) {

			for (int l = 1; l <= k; l++) {

				System.out.print(" ");

			}
			for (int n = num; n >= k * 2 - 1; n--) {
				
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
