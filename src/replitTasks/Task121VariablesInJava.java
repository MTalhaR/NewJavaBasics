package replitTasks;

public class Task121VariablesInJava {
    /*
    declare 3 instance variables to hold an integer, double and char values.
    Create 2 instances of the class and assign values to variables and the print them
     */
    int num;
    double num1;
    char value;
    void print(){
        System.out.println(num +"\n"+ num1 +"\n"+ value);
    }

    public static void main(String[] args) {
        Task121VariablesInJava values=new Task121VariablesInJava();
        values.num=10;
        values.num1=10.23;
        values.value='a';
        values.print();

        Task121VariablesInJava values1=new Task121VariablesInJava();
        values1.num=100;
        values1.num1=100.23;
        values1.value='s';

    }
}
