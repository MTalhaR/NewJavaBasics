package replitTasks;

import java.util.Scanner;

public class Task34NestedIf_ScannerClass {

	public static void main(String[] args) {
		/*
		 * Write a program to find the largest number among three distinct numbers using
		 * nested if condition Please use Scanner class to take input from users
		 * **Expected Output:** Please enter 3 distinct numbers 4 5 and 14 The largest
		 * number is 14
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("The largest number is " + num1);
			}
		}
		if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("The largest number is " + num2);
			}
		}
		if (num3 > num1) {
			if (num3 > num2) {
				System.out.println("The largest number is " + num3);
			}
		}
	}

}
