package replitTasks;

public class Task82Arrays2D {

	public static void main(String[] args) {
		// Write a program that will print the sum of all elements in 2D array. 
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		int sum=0;
		for(int[] num:a) {
			for(int values:num) {
				sum+=values;
				
			}
		}
		System.out.println(sum);
	}

}
