package replitTasks;

public class Task107StringBuffer {
    /*
    # How would you reverse a String using StringBuffer Class
    Given String = "Hello Friends"
    **Expected Output:**
    sdneirF olleH
     */
    public static void main(String[] args) {
        StringBuilder word=new StringBuilder("Hello Friends");
        System.out.println(word.reverse());

    }

}
