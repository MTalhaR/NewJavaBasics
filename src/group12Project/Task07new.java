package group12Project;

public class Task07new {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		
		int a=10;
		boolean prime = false;
		
		for (int i=2; i<=a/2; i++) {
			if (a%i==0) {
				prime=true;
				break;
			}
		}
		if (!prime) {
			System.out.println(a+" is a prime number");
		}else {
			System.out.println(a+" is not a prime number");
		}
		
	}

}
