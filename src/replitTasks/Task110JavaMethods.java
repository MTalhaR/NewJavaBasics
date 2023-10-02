package replitTasks;

import G12Project2.Car;

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


    public void methodOne(String name, int number){
        System.out.println(name);
        for (int i = 0; i < 5; i++) {
            System.out.println(number);
        }
    }


    String methodTwo(String address){
        String name = address.toUpperCase();
        return name;
    }



    public static void main(String[] args) {
        Task110JavaMethods task110 = new Task110JavaMethods();
        String value = task110.methodTwo("america");
        System.out.println(value);
        task110.methodOne(value,10);
    }
}