package group12Project;

import java.util.Scanner;

public class Task02new {

	public static void main(String[] args) {
		/*Using Scanner create an array of countries. When an array is created, 
		 * retrieve all values from it and while 
			 * retrieving those values print capital for each country. 
*/
		Scanner scan = new Scanner(System.in);

		String[] name = new String[3];
		System.out.println("Write name of countries!");
		for (int i = 0; i < name.length; i++) {
			name[i] = scan.next();

			if (name[i].equals("Pakistan")) {
				System.out.println("Capital of " + name[i] + " is Islamabad");
			} else if (name[i].equals("Australia")) {
				System.out.println("Capital of " + name[i] + " is Canberra");
			} else if (name[i].equals("Germany")) {
				System.out.println("Capital of " + name[i] + " is Berlin");
			} else {
				System.out.println("Invalid country");
			}

		}
	}

}
