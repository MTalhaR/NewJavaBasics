package replitTasks;
    /* Create Class EncapsulationDemo
    create two variable as shown below.
    private String empName;
    private int empAge;
    Create the getter/setter methods for each variable.
    In Main Class and main method.
    Using setter methods assign the values as "John" and "30"
    Using getter methods print the values as below outputs. */
public class Task178Encapsulation {
}
class EncapsulationDemo {
    private String empName;
    private int empAge;

    public void setEmpAge(int empAge){

        this.empAge=empAge;
    }
    public void setEmpName(String empName){

        this.empName=empName;
    }
    public int getEmpAge(){
        System.out.println("Employee Age: "+empAge);
        return empAge;
    }
    public String getEmpName(){
        System.out.println("Employee Name: "+empName);
        return empName;
    }
}
class test178{
    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setEmpName("John");
        obj.setEmpAge(50);
        obj.getEmpName();
        obj.getEmpAge();
    }
}