package group12Project;

public class Task03 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] numbers = { { 5, 18, 96, 546, 3 }, { 45, 867, 4098, 14 }, { 34, 89, 6, 434, 99, 12 }, };

		System.out.println("----- Regular For Loop -----");

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {

			for (int j = 0; j < numbers[i].length; j++) {

				sum += numbers[i][j];

			}

		}
		System.out.println("The sum is " + sum);

		System.out.println("----- For Enhanced Loop -----");

		sum = 0;

		for (int[] nums : numbers) {

			for (int num : nums) {

				sum += num;

			}

		}

		System.out.println("The sum is " + sum);

	}

}
