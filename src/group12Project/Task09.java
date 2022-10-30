package group12Project;

public class Task09 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		  int[] numbers = {5, 18, 96, 546, 3};

	        int largest=0;
	        int smallest=numbers[0];

	        for(int nums:numbers) {

	            if(largest<nums) {

	                largest=nums;

	            } else if(smallest>nums) {

	                smallest=nums;
	            }


	        }

	        System.out.println("The smallest number is "+smallest);

	        System.out.println("The largest number is "+largest);
		
	}

}
