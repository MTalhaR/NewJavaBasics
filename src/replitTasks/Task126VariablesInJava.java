package replitTasks;

public class Task126VariablesInJava {
    /*
    Create a variable that will hold the count of all instances of the Main class
    Create 3 Object of the class and print value of the count variable;
     */
    static int counter;
    {
        counter=counter+1;
    }
    public static void main(String[] args) {
        Task126VariablesInJava num=new Task126VariablesInJava();
        Task126VariablesInJava num1=new Task126VariablesInJava();
        Task126VariablesInJava num2=new Task126VariablesInJava();
        System.out.println(counter);
    }
}

