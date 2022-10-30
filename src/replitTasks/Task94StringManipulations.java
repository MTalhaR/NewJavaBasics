package replitTasks;

public class Task94StringManipulations {
    /*
    - Create a String given="I love Java classes at Syntax"
    - Retrieve 2 Strings using substring method from given String and print them
     */
    public static void main(String[] args) {
        String given="I love Java classes at Syntax";
        String s1=given.substring(0, 11);
        String s2=given.substring(12);
        String s3=given.substring(5,7);
        System.out.println(s1);
        System.out.println(s2);
    }
}
