package replitTasks;

import java.util.Scanner;

public class Task41SwitchStatement {

	public static void main(String[] args) {
		/*
		 *Write a program using the switch statement  
		 *Let us consider the scenario regarding the born baby age 
		 *First Output: "Enter the age of the Child"
		 *case 1: if age is 1 print as "You can Crawl"
		 *case 2 : if age is 2 print as  "You can Talk"
		 *case 3: If age is 3 print as "You can Dance"
		 *case 4: if age is 4 print as "You can get Trouble"
		 *Other than this age (1-4) it should print "I don't know how old you are" 
		 */
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the age of the Child");
		int age=inp.nextInt();
		String action = null;
		switch(age) {
		case 1:
			action="Crawl";
			break;
		case 2:
			action="Talk";
			break;
		case 3:
			action="Dance";
			break;
		case 4:
			action="get Trouble";
			break;
		default:	
			System.out.println("I don't know how old you are");
		}
			System.out.println("You can "+action);
	}

}
