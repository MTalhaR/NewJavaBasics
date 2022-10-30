package replitTasks;

import java.util.Scanner;

public class Task78Arrays {

	public static void main(String[] args) {
		/*
		 * Create an int array of integers with a size of 5 and input values with Scanner. 
		 * Don't print prompt questions for a user.
		 * Using loop print out each element of the array that should look like the output below
		 */
		
		Scanner scan=new Scanner(System.in);
		int[] num=new int[5];
		int i=0;
		 for( i=0; i<num.length; i++) {
			 num[i]=scan.nextInt();
			 int numbers=num[i]*10;
			 System.out.println(numbers);
		 }
		 
		
	}

}
