package replitTasks;

import java.util.Scanner;

public class Task22ScannerClass {

	public static void main(String[] args) {
		/*
		 * Write a program to take user name, age and mobile number
		 * First Output: "Enter your name"
		 * Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
		 * Third Output: "Enter your age"
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.next();
		System.out.println("Enter your mobile number");
		String number=scanner.next();
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is "+number);
	}

}
