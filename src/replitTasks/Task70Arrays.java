package replitTasks;

public class Task70Arrays {

	public static void main(String[] args) {
		/*
		 * Write a program that creates an array of integers and stores 
		 * the following values: 
		 * 45, 78, 12,  67, 55 and then prints all array values. 
		 * **Output:**
		 * 45 78 12 67 55
		 */
		
		int[] num= {45, 78, 12, 67, 55};
		System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]);
		
		System.out.println("---------------");
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
