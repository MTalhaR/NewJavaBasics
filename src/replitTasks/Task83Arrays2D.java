package replitTasks;

public class Task83Arrays2D {

	public static void main(String[] args) {
	// Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers

		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
		int sumRow1=0;
		int sumRow2=0; 
		int sumRow3=0; 
		int sumRow4=0;
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (i==0 && j<=2) {
					sumRow1+=a[i][j];}
					else if(i==1 && j<=2) {
						sumRow2+=a[i][j];
					}else if(i==2 && j<=2) {
						sumRow3+=a[i][j];
					}else if(i==3 && j<=2) {
						sumRow4+=a[i][j];
					}
				}
			}
		int [] sumRows= {sumRow1, sumRow2, sumRow3, sumRow4};
		for(int i=0; i<sumRows.length; i++) {
			System.out.println(sumRows[i]);
		}
		}
		
	}
