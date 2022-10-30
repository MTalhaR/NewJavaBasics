package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		System.out.println("What is the person height");
		int height=input.nextInt();
		
		 if (height<60) {
			 System.out.println("The person 1 is short height");
		 }
		 else if (height>=60 && height<=72) {
			 System.out.println("The person 2 is medium height");
		 }
		 else if (height>72) {
			 System.out.println("The person 3 is tall heighted");
		 }
	}

}
