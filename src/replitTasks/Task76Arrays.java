package replitTasks;

import java.util.Scanner;

public class Task76Arrays {

	public static void main(String[] args) {
		/*
		 * Write a program that creates a String array with size 7. 
		 * Ask the user to input Days of a week beginning with Sunday 
		 * using Scanner class.
		 * Add these inputs to your array and then print all values from that array
		 */
		
		Scanner scan=new Scanner(System.in);
		String[] days=new String[7];
		
		for (int i=0; i<days.length; i++) {
			System.out.println("Please enter day "+(i+1)+" of the week");
			days[i]=scan.next();
			System.out.println(days[i]);
		}
		System.out.println("--------------");
		System.out.println("Please enter day of the week");
		int i=0;
		for (i=0; i<days.length; i++) {
			
			days[i]=scan.next();
			
		}
		System.out.println(days[i]);
	}

}
