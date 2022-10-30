package replitTasks;

import java.util.Scanner;

public class Task39LogicalOperators {

	public static void main(String[] args) {
		/*
		 * A school has following rules for grading system:
		 * a. 1 to 25 - F
		 * b. 25 to 45 - E
		 * c. 45 to 50 - D
		 * d. 50 to 60 - C		 
		 * e. 60 to 80 - B
		 * f. Above 80 - A
		 * Ask the user to enter marks and print the corresponding grade. 
		 * **Example Output:**
		 * Please enter your mark
		 * Your grade is A
		 * **Example Output:**
		 * Please enter your mark
		 * Please enter valid mark
		 */
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=inp.nextInt();
		char grade = 0;
		if(marks>=1 && marks<=25) {
			grade='F';
		}
		else if(marks>25 && marks<45) {
			grade='E';
		}
		else if(marks>=45 && marks<=50) {
			grade='D';
		}
		else if(marks>50 && marks<=60) {
			grade='C';
		}
		else if(marks>60 && marks<=80) {
			grade='B';
		}
		else if(marks>80 && marks<=100) {
			grade='A';
		}
		else {
			System.out.println("Please enter valid mark");
		}
		System.out.println("Your grade is "+grade);
	}

}
