package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExamples {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("Did you get the job?");		
			answer=scan.next();
		
		} while(!answer.equals("yes"));
		
		System.out.println("Congrats");
	}

}
