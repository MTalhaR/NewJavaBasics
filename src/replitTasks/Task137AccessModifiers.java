package replitTasks;

public class Task137AccessModifiers {
    /*
    In main class please declared the variables using different access modifiers that will hold value for:
    - name
    - city
    - name of the school
    - batch number
    Create a method to display details in following format:
    My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
    Assign values to the variables and execute method display
     */
    private String name;
    public String city;
    protected String nameSchool;
    int batchNo;
    void display(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+nameSchool+" in batch "+batchNo);
    }

    public static void main(String[] args) {
        Task137AccessModifiers ans=new Task137AccessModifiers();
        ans.name="John";
        ans.batchNo=9;
        ans.city="Miami";
        ans.nameSchool="Syntax";
        ans.display();
    }
}
