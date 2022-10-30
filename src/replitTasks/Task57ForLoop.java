package replitTasks;

public class Task57ForLoop {

	public static void main(String[] args) {
		/*
		 * Create a for loop that prints out odd numbers from 5 to 22
		 * Must not include the number 22 in the output 
		 */
		
		for(int i=5; i<22; i+=2) {
			System.out.println(i);
		}
		System.out.println("---------");
		for(int i=5; i<22; i++) {
			if (i%2==1)
			System.out.println(i);
		}
	}

}
