package group12Project;

public class Task07 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		
		int num=50;

		for (int i=2; i<num; i++) {
		    int prime=0;
		    for (int j=2; j<i; j++) {
		        if(i%j==0) {
		          prime++ ;

		        }

		    }

		    if (prime==0) {
		        System.out.println(i+", ");
		    }
		}
		
		
	}

}
