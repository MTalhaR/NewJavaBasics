package group12Project;

public class Task04 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */

		int[][] numbers = { { 5, 18, 96, 546, 3 }, { 45, 867, 4098, 14 }, { 34, 89, 6, 434, 99, 12 } };

		System.out.print("The even numbers are: ");

		for (int[] num : numbers) {

			for (int nums : num) {

				if (nums % 2 == 0) {

					System.out.print(nums + " ");

				}

			}
		}

	}

}
