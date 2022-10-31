package replitTasks;
     /* Create Class EncapsulationDemo that will have 2 variables empName and empAge;
        Create the getter/setter methods for each variable.
        In Main Class and main method
        Using setter methods assign the values as "Mario" and "32"
        Using getter methods print the values as below outputs.*/
public class Task179Encapsulation {
         public static void main(String[] args){
             EncapsulationDemo1 obj=new EncapsulationDemo1();
             obj.setEmpName("Mario");
             obj.setEmpAge(32);
             obj.getEmpName();
             obj.getEmpAge();
         }
}
class EncapsulationDemo1{
private String empName;
private int empAge;
public void setEmpName(String empName){

    this.empName=empName;
        }
public void setEmpAge(int empAge){

    this.empAge=empAge;
        }
public String getEmpName(){
        System.out.println("Employee Name: "+empName);
        return empName;
        }
public int getEmpAge(){
        System.out.println("Employee Age: "+empAge);
        return empAge;
        }
        }