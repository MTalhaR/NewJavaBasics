package replitTasks;

public class Task81Arrays2D {

	public static void main(String[] args) {
		/*
		 * Write a program that prints the highest value in the array.
		 * **Expected Output:**
		 * input [5,4,8]
		 * 8
		 */
		
		int[][] numbers= {{5, 4, 8},
					  {1, 2 ,10},
							    };
		int largest=0;
		for(int[]num:numbers) {
			for(int values:num) {
				if(largest<values) {
					largest=values;
				}
			}
		}
		System.out.println(largest);
		
		System.out.println();
		System.out.println("-----------");
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				if(largest<numbers[i][j]) {
					largest=numbers[i][j];
				}
			}
			System.out.println(largest);
		}
	}

}
