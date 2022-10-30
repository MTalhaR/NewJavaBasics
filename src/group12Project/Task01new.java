package group12Project;

import java.util.Scanner;

public class Task01new {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values. After the array is created,
		 * calculate the sum of all stored elements in that array.
		 */
		
		Scanner input=new Scanner(System.in);
		
		 int [] array=new int [5];
		 
		 System.out.println("Enter Values:");

		for (int i=0; i<5; i++) {
		    array[i]=input.nextInt();

		} 
		int sum = 0;
		for (int i=0; i<array.length; i++) {
		    sum+=array[i];
		   
		}
		System.out.println(sum + " ");
	}

}
