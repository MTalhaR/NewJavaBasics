package replitTasks;

public class Task116JavaMethods {
    /*
    Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
    ( Return false if one or both given numbers are not even)
    Examples:
    - bothEven(4,6) ==> true
    - bothEven(3,4) ==> false
    - bothEven(-1,1) ==> false
     */
    boolean numbers (int n1, int n2){

        if (n1%2==0 && n2%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Task116JavaMethods value=new Task116JavaMethods();
        boolean evenOdd=value.numbers(24,35);
        System.out.println(evenOdd);
    }
}
