package com.syntax.class06;

public class LargestNumber {

	public static void main(String[] args) {
		// find largest number
		// find if it is even or odd
		
			int n1=100;
	        int n2=100;
	        int n3=100;

	        int largest = 0;
	        
	        
	        if(n1>n2 && n1>n3) {
	        largest=n1;  
	        } 
	        else if (n2>n3 && n2>n1) {
	        largest=n2;	        	
	        } 
	        else if (n3>n1 && n3>n2) {
	        largest=n3;	        
	        } 
	        
	       if (largest!=0) {
	        
	        if (largest%2==0) {
	        	System.out.println(largest+" is even number");
	        }
	        else {
	        	System.out.println(largest+" is odd number");
	        }
	       }
	}

}
