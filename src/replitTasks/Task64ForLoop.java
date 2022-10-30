package replitTasks;

import java.util.Scanner;

public class Task64ForLoop {

	public static void main(String[] args) {
		/*
		 * You should input:
		 * int end;
		 * Write a for loop that will print out a series of numbers starting at 0 and 
		 * ending at the doubled value of end(value must be taken from a user), exclusive.
		 * Each number should be on the same line, separated by a space. 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a value");
		int a=scan.nextInt();
		int b=a*2;
		for(int i=0; i<=b; i++) {
			System.out.print(i+" ");
		}
	}

}
