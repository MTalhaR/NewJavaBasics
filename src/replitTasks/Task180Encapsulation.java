package replitTasks;
     /* Create Class EncapsulationDemo
        create two variable as shown below.
        private String empName=John;
        private int empAge=30;
        Create only getters methods for each variable.
        Print the values of each variable as shown below.*/
public class Task180Encapsulation {
}
class Main {
    public static void main(String[] args){
        EncapsulationDemo2 obj=new EncapsulationDemo2();
        obj.getEmpName();
        obj.getEmpAge();
    }
}
class EncapsulationDemo2{
    private String empName="John";
    private int empAge=30;
    public String getEmpName(){
        System.out.println("Employee Name: "+empName);
        return empName;
    }
    public int getEmpAge(){
        System.out.println("Employee Age: "+empAge);
        return empAge;
    }
}