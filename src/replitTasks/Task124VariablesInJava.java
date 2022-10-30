package replitTasks;

public class Task124VariablesInJava {
    /*
    Declare static variable in class level as below and assign its value:
    String ss="Welcome To Syntax Technologies"
    Access variable in the main method and print it using three ways you learned so far
    Hint:
    first way: By calling directly
    Second way: By using the className
    Third way: By creating the object of the class
     */
    static String ss="Welcome To Syntax Technologies";

    void print(){
        System.out.println(ss);
    }
    public static void main(String[] args) {
        System.out.println(ss);     //first way: By calling directly
        System.out.println(Task124VariablesInJava.ss);  // Second way: By using the className
        Task124VariablesInJava str=new Task124VariablesInJava();
        str.print();                //Third way: By creating the object of the class
    }
}
