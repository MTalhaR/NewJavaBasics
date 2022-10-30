package practice;

public class finalPractive {
   int a;
   final int b=6;
    void print(){
        System.out.println("Talha");
    }
}
class childClass extends finalPractive{
    void print(){
        System.out.println("Talha");
    }
    public static void main(String[] args) {
        finalPractive object =new finalPractive();
       object.print();

    }
}
