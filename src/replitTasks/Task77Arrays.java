package replitTasks;

import java.util.Scanner;

public class Task77Arrays {

	public static void main(String[] args) {
		/*
		 * Create an array of integers that will store 5 elements taken from a user
		 * Don't print any prompt message for the user
		 * Then print out all the elements you have created in the 
		 * first loop in reverse order. 
		 */
		Scanner scan=new Scanner(System.in);
		int[] num=new int[5];
		int i;
		 for(i=0; i<num.length; i++) {
			 num[i]=scan.nextInt();
		 }
		 
		 for(int j=num.length-1; j>=0; j--) {
		System.out.println(num[j]);
		 }
		 
		
		 
	}

}
