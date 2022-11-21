package replitTasks;

import java.util.Scanner;

/*  Create a method that will do temperature check. Anytime user passes temperture that is below 32
method should throw an Exception saying "It is freezing"
In Main method call the method and handle an Exception
**Expected Output:**
java.lang.RuntimeException: It is freezing */
public class Task213Exception {
    public static void temperature(int temp){
        if (temp>=32){
            System.out.println("Temperature is good");
        } else {
            throw new RuntimeException("It is freezing");
        }
    }

    public static void main(String[] args) {
        try {
            temperature(30);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
