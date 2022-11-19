package practice;

public class replerror {
    public static void main(String[] args) {
        try{
            int a=10, b=0;
            int result;
            result = a/b;
        }
        catch(Exception e){
            System.out.println("/ by zero");
        }
    }
}
