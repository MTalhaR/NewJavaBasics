package replitTasks;

import java.util.Scanner;

/* Create a custom Exception class
In main class create a method that will check students grade
if students grade is >90 then below exception should be thrown
if students grade is below 90 print "You are a great student"
In main method calls method gradeCheck and handle an Exception
**Expected Output:**
SyntaxStudentException: You are an exceptionally awesome student */
public class Task214Exception {
    public static void gradeCheck(int marks) {
        if (marks>90){
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        } else {
            System.out.println("You are a good student");
        }
    }

    public static void main(String[] args) {
        try {
            gradeCheck(95);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
class SyntaxStudentException extends RuntimeException{
    SyntaxStudentException(String message){

        super(message);
    }
}
