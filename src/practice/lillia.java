package practice;

public class lillia {
}
class EncapsulationDemo{
    String empName;
    int empAge;

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName){
        this.empName="Lillia";
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setempAge(int empAge){
        this.empAge=32;
    }
    void printInfo(){
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Age: "+empAge);
    }
}
class Main123{
    public static void main(String[] args) {
        EncapsulationDemo encap=new EncapsulationDemo();
        encap.setEmpName("Lillia");
        encap.setempAge(25);
        encap.printInfo();
    }
}
