package group12Project;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		int temp, size;
	      int array[] = {10, 20, 25, 63, 96, 57, 25, 112};

	      for(int i = 0; i<array.length; i++ ){
	         for(int j = i+1; j<array.length; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second largest number is:: "+array[array.length-2]);
	     
	      System.out.println("------------------");
	      
	      int [] array1= {100,200,300,400,350,250,500,100};
	      int highest=0;
	      int secondlargest=0;
	      
	      for (int i=0;i<array1.length;i++) 
	          if(array1[i]>highest) {
	              secondlargest=highest;
	              highest=array1[i];
	          }
	          else if ( array1[i] > secondlargest) {
	              secondlargest=array1[i];

	          }
	          System.out.println(secondlargest);
	    	  
	      
	
	}

}
