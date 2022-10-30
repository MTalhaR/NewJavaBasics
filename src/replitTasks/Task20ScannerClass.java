package replitTasks;

import java.util.Scanner;

public class Task20ScannerClass {

	public static void main(String[] args) {
		/*
		 * Write  a program that takes user's first name and last name and prints in console
		 * Instruct the user to enter first name: "Please Enter First Name"
		 * Capture the first name
		 * Instruct the user to enter last name:"Please Enter Last Name" 
		 * Capture last name
		 * Print first name and last name
		 */
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter First Name");
		String FirstName=scanner.next();
		System.out.println("Please Enter Last Name");
		String LastName=scanner.next();
		System.out.println(FirstName+" "+LastName);
	}

}
