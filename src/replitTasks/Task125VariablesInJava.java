package replitTasks;

public class Task125VariablesInJava {
    /*
    Declare a static variable **number** that will hold an integer value:
    Access **number** from the main method and assign value to it.
    Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
    Print out **number** using class name and using instance
     */
    static int number;
    void num(int num){
        System.out.println(num);
    }

    public static void main(String[] args) {
        number=200;
        Task125VariablesInJava value=new Task125VariablesInJava();
        value.num(200);
        System.out.println(Task125VariablesInJava.number);
        String a="asdsad";
        char b='s';

    }
}
