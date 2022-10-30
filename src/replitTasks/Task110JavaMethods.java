package replitTasks;

public class Task110JavaMethods {
    /*
    1. Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
    2. Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
    3. Call both methods
     */
    void newLine() {
        System.out.println("newLine method implementation");
    }

    void displayLine() {
        System.out.println("displayLine method implementation");
    }

    public static void main(String[] args) {
        Task110JavaMethods value = new Task110JavaMethods();
        value.newLine();
        value.displayLine();
    }
}