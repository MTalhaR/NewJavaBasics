package replitTasks;

import java.util.Scanner;

public class Task37LogicalOperators {

	public static void main(String[] args) {
		/*
		 * Take 2 boolean inputs from a user:
		 * "Are you thirsty?"
		 * "Are you sleepy?"
		 * If user is thirsty and not sleepy--> drink=water
		 * If user is thirsty and sleepy--> drink=coffee
		 * If user is not thirsty and sleepy --> drink=tea
		 * Otherwise drink="nothing"
		 * Output:
		 * - Looks like you need to drink \_\_\_
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean thirsty=inp.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean sleepy=inp.nextBoolean();
		String answer = null;
		
		if(thirsty && !sleepy) {
			answer= "water";
		}
		else if(thirsty && sleepy) {
			answer=" coffee";
		}
		else if(!thirsty && sleepy) {
			answer="tea";
		}
		else if (!thirsty && !sleepy) {
			answer="nothing";
		}
		System.out.println("Looks like you need to drink "+answer);
	}
}