package replitTasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* Create a method that will not be handling exception and throwing it at caller.
In main method call method and handle the exception.
**Expected Output:**
java.io.FileNotFoundException:  (No such file or directory) */
public class Task212Exception {
    public static void method() throws FileNotFoundException {
        String path="";
        FileInputStream fis=new FileInputStream(path);
    }

    public static void main(String[] args) {
        try{
            method();
        } catch (Exception a){
            System.out.println(a);
        }

    }
}
