package replitTasks;

public class Task74Arrays {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers of size 11. 
		 * Add the years 2010 to 2020 to your array one by one using a for loop and then print all those values. 
		 * **Example:** 
		 * 2010
		 * 2011
		 * 2012
		 * 2013
		 * 2014
		 * 2015
		 * 2016
		 * 2017
		 * 2018
		 * 2019
		 * 2020
		 */
		
		int[] years=new int[11];
		years[0]=2010;
		years[1]=2011;
		years[2]=2012;
		years[3]=2013;
		years[4]=2014;
		years[5]=2015;
		years[6]=2016;
		years[7]=2017;
		years[8]=2018;
		years[9]=2019;
		years[10]=2020;
		
		
		for(int i=0; i<years.length; i++) {
			System.out.print (years[i]+" ");
		}
		System.out.println("---------------");
		
		for (int i=0; i<years.length; i++) {
			for (int j=2010+i; j<=2010+i; j++) {
			System.out.print(j+" ");
		}
		}
		System.out.println("------------");
		
		for(int i=0; i<years.length; i++) {
			years[i]=2010+i;
			System.out.print(years[i]+" ");
			
		}
		
	}

}
