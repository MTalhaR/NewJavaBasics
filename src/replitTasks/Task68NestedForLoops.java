package replitTasks;

public class Task68NestedForLoops {

	public static void main(String[] args) {
		/*
		 * Write a program to print out the pattern: 
		 *  **Expected output:**
		 *  $$$$
		 *  $  $
		 *  $  $
		 *  $$$$
		 */
		
		for (int i = 1; i <= 4; i++){
		      for (int j = 1; j<= 4; j++){
		        if ((i == 2 || i == 3) && (j == 2 || j == 3)){
		          System.out.print(" ");
		        continue;
		        }
		        System.out.print("$");
		      }
		      System.out.println();
		    }
		System.out.println("-------------------------------------");
		
		
		for(int a=1; a<=2; a++) {
            for(int b=1; b<=2; b++) {
                if(a==2||a==3)
                    System.out.println("$"+" "+" "+"$");
            }
            		System.out.println("$"+"$"+"$"+"$");
            }
	}

}
