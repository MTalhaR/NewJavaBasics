package group12Project;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values. After the array is created,
		 * calculate the sum of all stored elements in that array.
		 */

		Scanner scanner = new Scanner(System.in);

		int sum = 0;

		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int num : arr) {
			sum += num;
		}

		System.out.println("The sum of all elements in the array is " + sum);

	}

}
