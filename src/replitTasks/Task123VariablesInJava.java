package replitTasks;

public class Task123VariablesInJava {
    /*
    Declare the **instance** variables to hold:
    - integer values
    - String values
    - double values
    - boolean values
    - float values
    Access instance variables and then print them all without assigning any values to them.
    Print variables one by one the same sequence that you declare them.
     */
    int num;
    String str;
    double num1;
    boolean abc;
    float num2;
    void print(){
        System.out.println(num+"\n"+str+"\n"+num1+"\n"+abc+"\n"+num2);
    }
    public static void main(String[] args) {
        Task123VariablesInJava value=new Task123VariablesInJava();
        value.print();
    }
}
