package replitTasks;

public class Task114JavaMethods {
    /*
    Step1: Create three methods that will accept 2 in parameters on integer type
    Step2: Write the logic in methods to perform actions below:
    The first method for multiplication
    The second method for addition
    The third method for subtraction
    Step3: execute all methods
    1. for the addition method add two numbers to make 30
    2. for multiplication multiply two numbers to make 30
    3. for Subtraction subtract two numbers to equal 20
     */

   void multiplication(int n1, int n2){
        System.out.println("Multiplication "+(n1*n2));
    }
    void addition (int n1, int n2){
        System.out.println("Addition "+(n1+n2));
    }
    void subtraction (int n1, int n2){
        System.out.println("Subtraction "+(n1-n2));
    }

    public static void main(String[] args) {
        Task114JavaMethods value=new Task114JavaMethods();
        value.addition(10,20);
        value.multiplication(10,3);
        value.subtraction(50,30);
    }
}
