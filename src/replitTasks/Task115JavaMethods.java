package replitTasks;

public class Task115JavaMethods {
    /*
    Create a method that will accept a String as a parameter and return new String all in upper case
    Call method
     */
    String name(String str){
        String newstr=str.toUpperCase();
        return newstr;
    }

    public static void main(String[] args) {
        Task115JavaMethods newstr=new Task115JavaMethods();

        System.out.println(newstr.name("TAlha"));
    }
}
