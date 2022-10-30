package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// print numbers from 100 to 1
		int num = 100;

		while (num >= 1) {
			System.out.print(num + " ");
			num--;
		}
		System.out.println("------------------");
		// print even numbers from 20 to 100
		int a = 20;

		while (a <= 100) {
			System.out.print(a + " ");
			a += 2;
		}
		System.out.println("---------------");
		// print only odd numbers from 100 to 1
		int b = 99;

		while (b >= 1) {
			System.out.print(b + " ");
			b -= 2;
		}
		System.out.println("-----------------");
		int c = 100;

		while (c >= 1) {
			if (c % 2 == 1) {
				System.out.print(c + " ");
			}
			c--;
		}
	}

}
