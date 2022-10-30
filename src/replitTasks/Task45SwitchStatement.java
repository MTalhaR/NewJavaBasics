package replitTasks;

import java.util.Scanner;

public class Task45SwitchStatement {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter any number from 1-7.
		 * Based on the number define the day of the week
		 * **Example Output:**
		 * Input a number between 1-7
		 * Friday
		 * **Example Output:**
		 * Input a number between 1-7
		 * Invalid
		 */
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter any number from 1-7");
		int num=inp.nextInt();
		String day= null;
		
		switch(num) {
		case 1:
			day="Monday";
			break;
		case 2:
			day="Tuesday";
			break;
		case 3:
			day="Wednesday";
			break;
		case 4:
			day="Thursday";
			break;	
		case 5:
			day="Friday";
			break;
		case 6:
			day="Saturday";
			break;
		case 7:
			day="Sunday";
			break;		
		}
		System.out.println(day);
	}
}	