package replitTasks;

import java.util.Scanner;

public class Task24ScannerClass {

	public static void main(String[] args) {
		// Write a program that takes a user's name and prints it. 
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hello, please enter your name");
		String name=scanner.next();
		System.out.println("Your name is " + name);
		
	}

}
