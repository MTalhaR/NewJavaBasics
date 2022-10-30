package practice;

public class A1 {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    static void printF(){
        System.out.println("abcdef");
    }
}
class B1 extends A1 {

    public static void main(String[] args) {

       B1.printF();
    }
}
