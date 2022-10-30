package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades. 
		 * Then your program should print name of the students that has A and B grade
		 */
		
		String[][] arr= {
					 {"Talha", "Janel", "Saira", "Shah"},
					 {"A", "B", "C", "D"},
		};
		System.out.println("The grade of "+arr[0][0]+" is "+arr[1][1]);
		System.out.println("The grade of "+arr[0][1]+" is "+arr[1][0]);
		System.out.println("The grade of "+arr[0][2]+" is "+arr[1][2]);
		System.out.println("The grade of "+arr[0][3]+" is "+arr[1][3]);
		
		System.out.println("------------------------------");
		
		 for(int i=0; i<arr.length; i++) {
	            for (int j=0; j<arr[i].length; j++){
	                System.out.println( arr[i][j]);
	            }
	        }
		
	}

}
