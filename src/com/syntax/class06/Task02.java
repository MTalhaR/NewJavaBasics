package com.syntax.class06;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner inp=new Scanner(System.in);
		System.out.println("Enter your quiz score");
		int quiz=inp.nextInt();
		System.out.println("Enter your mid term score");
		int midTerm=inp.nextInt();
		System.out.println("Enter your final score");
		int finalTerm=inp.nextInt();
		
		int average=(quiz+midTerm+finalTerm)/3;
		
		String score;
		
		if (average>=90) {
			score="A";
		}
		else if (average>=70 && average<90) {
			score="B";
		}
		else if (average>=50 && average<70) {
			score="C";
		}
		else if (average<50 && average>0) {
			score="F";
		}
		else {
			score="Invalid";
		}
		System.out.println("Your grade is "+score);
	}

}
