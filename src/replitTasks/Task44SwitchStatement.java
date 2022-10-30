package replitTasks;

import java.util.Scanner;

public class Task44SwitchStatement {

	public static void main(String[] args) {
		/*
		 *Prompt user with questions: "Please enter your favorite car make"
		 *- if user enters  BMW -->  carOrigin = "german car"
		 *- if user enters  Toyota -->  carOrigin = " japanese car"
		 *- if user enters  Maserati -->  carOrigin = "italian car"
		 *- anything else besides those values --> carOrigin = "unknown" 
		 *The output of your program should be:
		 *"Your favorite car is ___"
		 */
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		String brand=inp.next();
		String car= null;
		
		switch(brand) {
		case "BMW":
			car="german car";
			break;
		case "Tyota":
			car="japanese car";
			break;
		case "Maserati":
			car="italian car";
			break;
		default:
			car="unknown";
			break;	
		}
		System.out.println("Your favorite car is "+car);
		
	}

}
