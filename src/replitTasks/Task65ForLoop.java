package replitTasks;

import java.util.Scanner;

public class Task65ForLoop {

	public static void main(String[] args) {
		// Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int x=scan.nextInt();
		
		for(int i=x-1; i>=0; i--) {
			System.out.print(i+" ");
		}
		
	}

}
