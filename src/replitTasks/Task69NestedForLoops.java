package replitTasks;

import java.util.List;

public class Task69NestedForLoops {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the pattern: 
		 * **Expected output:**
		 * 1 2 3 4 5 6 7 
		 * 1 2 3 4 5 6 
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2 
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 
		 * 1 2 3 4 5 
		 * 1 2 3 4 5 6 
		 * 1 2 3 4 5 6 7
		 */
//
//		for (int i = 7; i >= 1; i--){
//		      for (int j = 1; j <= i; j++){
//		        System.out.print(j+ " ");
//		      }
//		      System.out.println();
//		    }
//		    for (int x = 2; x <= 7; x++){
//		      for (int y = 1; y <= x; y++){
//		        System.out.print(y + " ");
//		      }
//		     System.out.println();
//		    }

String name = "talha";
String size = String.valueOf(name.length());
		System.out.println(size);
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < name.length(); j++) {
				System.out.println("talha");
				System.out.println();
			}
			System.out.println("new");
		}
















		    		    
	}

}
