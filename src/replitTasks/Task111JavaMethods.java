package replitTasks;

public class Task111JavaMethods {
    /*
    1. Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
    2. Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
    3. Call both methods
     */
    void syntaxTechnologies(){
        System.out.println("Welcome to Syntax Technologies!");
    }
    void syntaxStudents(){
        System.out.println("Welcome Syntax Students!");
    }

    public static void main(String[] args) {
        Task111JavaMethods value=new Task111JavaMethods();
        value.syntaxTechnologies();
        value.syntaxStudents();
    }
}
