package replitTasks;

import java.util.Scanner;

public class Task40SwitchStatement {

	public static void main(String[] args) {
		/*
		 * By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.
		 * First Output: "Enter name of the instructor"
		 * case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
		 * case 2: if User provided the name as Moazzam as input it should show  "Will take care of SDLC Assignment"
		 * case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
		 * case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
		 * Other than these four names if the user provides any other names --> " Invalid instructor selected"
		 */
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name=inp.next();
		String assignment = null;
		switch(name) {
			case "Asghar":
			assignment="Java";	
			break;
			case "Moazzam":
			assignment="SDLC";	
			break;
			case "Weqas":
			assignment="Selenium";
			break;
			case "Asel":
			assignment="every";	
			break;
			default:
			System.out.println("Invalid instructor selected");	
		}
		System.out.println(name+" will take care of "+assignment+" assignment");
		
	}

}
