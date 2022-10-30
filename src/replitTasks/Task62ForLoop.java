package replitTasks;

public class Task62ForLoop {

	public static void main(String[] args) {
		// Using for loop Print 1 to 10 Numbers except 5 and 6
		
		for (int i=1; i<=10; i++) {
			if (i==5 || i==6) {
				continue;
			}
			System.out.println(i);
		}

	}

}
