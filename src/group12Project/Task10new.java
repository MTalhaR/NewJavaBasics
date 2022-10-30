package group12Project;

public class Task10new {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		int [] a= {100,200,300,400,350,250};
	      int highest=0;
	      int secondlargest=0;
	      
	      for (int i=0;i<a.length;i++) 
	          if(a[i]>highest) {
	              secondlargest=highest;
	              highest=a[i];
	          }
	          else if ( a[i] > secondlargest) {
	              secondlargest=a[i];

	          }
	          System.out.println(secondlargest);
	    	  
		
	}

}
