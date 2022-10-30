package replitTasks;

public class Task72Arrays {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array with the 
		 * following values{s, a, y,  b, n, c, t,  d, a, e, x} 
		 * Print the values so the output should look like below
		 * **Output:**
		 * syntax
		 */
		
		char[] abc= {'s', 'a', 'y',  'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};
		
		System.out.println(abc[0]+""+abc[2]+""+abc[4]+""+abc[6]+""+abc[8]+""+abc[10]);
		System.out.println();
		
		for(int i=0; i<abc.length; i+=2) {
			System.out.print(abc[i]);
		}
		
	}

}
