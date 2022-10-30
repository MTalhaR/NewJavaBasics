package replitTasks;

public class Task50WhileLoop {

	public static void main(String[] args) {
		/*
		 * Step 1: Initialize the i value as int i=7.
		 * Step 2: Write a program to print a sequence of numbers starting from 7 to 98. 
		 */
		
		int i=7;
		while(i<=98) {
			if (i%7==0) {
				System.out.println(i);
				
			}
			i++;
		}
		System.out.println("---------------------");
		
		int a=7;
		while(a<=98) {
			System.out.println(a);
			a+=7;
		}
	}

}
