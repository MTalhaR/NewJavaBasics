package replitTasks;

public class Task92StringManipulations {
    /*
    Validate if the string ends with "u" prints the boolean value accordingly.
    Validate if the string ends with "world" prints the boolean value accordingly.
    Validate if the string ends with "are" prints the boolean value accordingly.
    Validate if the string ends with "you" prints the boolean value accordingly.
     */
    public static void main(String[] args) {
        String s1="hello how are you";
        String s2="";
        System.out.println(s1.endsWith("u"));
        System.out.println(s1.endsWith("world"));
        System.out.println(s1.endsWith("are"));
        System.out.println(s1.endsWith("you"));
    }

}
