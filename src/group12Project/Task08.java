package group12Project;

public class Task08 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		// 0 1 1 2 3 5 8 13 21 34
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (int i = 2; i < 10; i++)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		
	}

}
