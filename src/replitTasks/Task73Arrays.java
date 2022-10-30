package replitTasks;

public class Task73Arrays {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of strings with the following values
		 * {"This", "is", "array", "of", "strings"} and prints all values in one line.
		 * **Output:**
		 * This is array of strings
		 */
		
		String[] abc= {"This", "is", "array", "of", "strings"};
		System.out.println(abc[0]+" "+abc[1]+" "+abc[2]+" "+abc[3]+" "+abc[4]);
	
		System.out.println("------------");
		
		for(int i=0; i<abc.length; i++) {
			System.out.print(abc[i]+" ");
		}
		System.out.println("----------");
		for(String values:abc) {
			System.out.print(values+" ");
		}
	}

}
