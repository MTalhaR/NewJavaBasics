package replitTasks;

import java.util.Scanner;

public class Task21ScannerClass {

	public static void main(String[] args) {
		/*
		 * Write a program that asks the user's age: "Enter your age  "
		 * Then display it by adding 10 (i.e age + 10) in your final output. 
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		System.out.println("Your age after 10 years is " +(age +10));
		
	}

}
