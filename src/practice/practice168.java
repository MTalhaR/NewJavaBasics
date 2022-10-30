package practice;

public class practice168 {}
class Main {
    final double avgElements(int[] arr){
        double average;
        int length=arr.length;
        double sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        average=sum/(length);
        return average;
    }
    public static void main(String[] args) {
        Main obj=new Main();
        int[] a = {2,7,3,8,4};
        System.out.println(obj.avgElements(a)); //should print 4.8
    }
}



/*class Main implements Functions{
    //double firstNumber=100.00;
    //double secondNumber=20.00;
    public void display(){
        System.out.println("Result is ::: "+adding(100,20));
    }
    public double adding(double firstNumber,double secondNumber){
        return firstNumber+secondNumber;
    }
    public double subtracting(double firstNumber,double secondNumber){
        return firstNumber-secondNumber;
    }
    public double multiply(double firstNumber,double secondNumber){
        return firstNumber*secondNumber;
    }
    public double dividing(double firstNumber,double secondNumber){
        return firstNumber/secondNumber;
    }
    public static void main(String[]args){
        Main obj=new Main();
        double a=obj.adding(100,20);
        double b=obj.subtracting(100,20);
        double c=obj.multiply(100,20);
        double d=obj.dividing(100,20);
        System.out.println("Result is ::: "+obj.adding(100,20));
        System.out.println("Result is ::: "+obj.subtracting(100,20));
        System.out.println("Result is ::: "+obj.multiply(100,20));
        System.out.println("Result is ::: "+obj.dividing(100,20));
    }
}
interface Outputs{
    void display();
}
interface Functions extends Outputs{
    double adding(double firstNumber,double secondNumber);
    double subtracting(double firstNumber,double secondNumber);
    double multiply(double firstNumber,double secondNumber);
    double dividing(double firstNumber,double secondNumber);
}*/