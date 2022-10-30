package group12Project;

public class Task05 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum
		// of even and odd numbers for that array.

		int[][] arr = {
						{ 8, 11, 19, 24, 28, }, { 6, 15, 26, 19, },
																	};

		int Sumeven = 0;
		int Sumodd = 0;

		for (int[] all : arr) {
			for (int num1 : all) {
				if (num1 % 2 == 0) {
					Sumeven += num1;
				} else if(num1 %2==1) {
					Sumodd += num1;
				}	
			}
		}
		System.out.println("Total of sumeven is = " + Sumeven);
		System.out.println("Total of sumodd is = " + Sumodd);
	}

}
