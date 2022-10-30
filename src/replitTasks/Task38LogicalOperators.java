package replitTasks;

import java.util.Scanner;

public class Task38LogicalOperators {

	public static void main(String[] args) {
		/*
		 * Prompt user with a question: "Is it weekend?"
		 * If it is not a weekend --> subject="manual testing"
		 * Otherwise --> subject="Java"
		 * **Output**: 
		 * Today you will be learning ____
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean weekend = inp.nextBoolean();
		if(weekend) {
			System.out.println("Today you will be learning Java");
		}
		else {
			System.out.println("Today you will be learning manual testing");
		}
		
		
	}

}
