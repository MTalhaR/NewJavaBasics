package replitTasks;

public class Task122VariablesInJava {
    /*
    Declare 3 instance variables to hold:
    - name of the country
    - capital
    - population size
    Create a method to display values of instance variables
    Create 2 Object, assign values to instance variables, execute method display;
     */
    String name;
    String capital;
    int size;
    void values(){
        System.out.println("The capital of "+name+" is "+capital+" and population is "+size);
    }

    public static void main(String[] args) {
        Task122VariablesInJava s=new Task122VariablesInJava();
        s.capital="Washington DC";
        s.name="USA";
        s.size=330000000;
        s.values();
        System.out.println();
        Task122VariablesInJava s1=new Task122VariablesInJava();
        s1.capital="Astana";
        s1.name="Kazakhstan";
        s1.size=18500000;
        s1.values();
    }
}
