package replitTasks;
        /*Create Class Account
        Create the below variables:
        - acc_no;
        - name;
        - email;
        - double amount;
        Create the getter/setter methods for each variable.
        In Main Class and the main method.
        Using setter methods assign the values as:
        acc_no = 7560504000
        name = Sumair
        email = sumair@syntax.com
        amount = 50000.0
        Using getter methods print the values as below output.*/
public class Task181Encapsulation {
}
class Account{
    private long acc_no;
    private String name;
    private String email;
    private double amount;
    Account(long acc_no,String name,String email,double amount){
        setAcc_no(acc_no);
        setName(name);
        setEmail(email);
        setAmount(amount);
    }
    public void setAcc_no(long acc_no){

        this.acc_no=acc_no;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public long getAcc_no(){
        System.out.print(acc_no+" ");
        return acc_no;
    }
    public String getName(){
        System.out.print(name+" ");
        return name;
    }
    public String getEmail(){
        System.out.print(email+" ");
        return email;
    }
    public double getAmount(){
        System.out.print(amount);
        return amount;
    }
    void printInfo(){
        System.out.println(acc_no+" "+name+" "+email+" "+amount);
    }
}
class Main181 {
    public static void main(String[] args){
        Account obj=new Account(7560504000l, "Sumair","sumair@syntax.com",50000);
        obj.getAcc_no();
        obj.getName();
        obj.getEmail();
        obj.getAmount();
    }
}