package replitTasks;

import java.util.Scanner;

public class Task36LogicalOperators {

	public static void main(String[] args) {
		/*
		 * Prompt user to input two strings : "Please enter two strings" and two integers :
		 *"Please enter two numbers" and make the comparisons:
		 *- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
		 *- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
		 *- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"
		 ***Example input/output:**
		 *word1: banana
		 *word2: banana
		 *int1: 2
		 *int2: 2
		 *Output: AND
		 *```
		 *word1: banana 
		 *word2: apple 
		 *int1: 2 
		 *int2: 2 
		 *Output: OR
		 *'''
		 *word1: phone
		 *word2: pie
		 *int1: 2
		 *int2: 3
		 *Output: NONE
		 */
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter two strings");
		String s1=inp.next();
		String s2=inp.next();
		System.out.println("Please enter twonumbers");
		int n1=inp.nextInt();
		int n2=inp.nextInt();
		
		if(s1.equals(s2) && n1==n2) {
			System.out.println("AND");
		}
		else if(s1.equals(s2) || n1==n2) {
			System.out.println("OR");
		}
		else if(!(s1.equals(s2)) && n1!=n2) {
			System.out.println("NONE");
		}
		
		
		
	}

}
