package replitTasks;

public class Task84Arrays2D {

	public static void main(String[] args) {
		// Write a program that prints the total number of elements that are negative
		// AND odd

		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int size = 0;
		for (int[] num : a) {
			for (int values : num) {
				if (values < 0 && values % 2 == -1) {
					size = size+1;
				}
			}
		}
		System.out.println(size);
	}

}
