package replitTasks;

public class Task98StringManipulations {
    /*
    Create a String given="Hello Syntax friends".
    Using String methods from given String create new String "Welcome Syntax family"
     */
    public static void main(String[] args) {
        String given="Hello Syntax friends";
        String newGiven="Welcome "+given.substring(6,12)+" family";
        System.out.println(newGiven);
    }
}
