package replitTasks;

public class Task106StringBuffer {
    /*
    Instantiate and StringBuffer class.     Append Value "Hello" to it.     Append value "World" to it.
    Print in UPPERCASE.
    **Expected Output:**
    HELLO WORLD
     */
    public static void main(String[] args) {
    StringBuilder str=new StringBuilder("Hello");
    StringBuilder str1=new StringBuilder("World");
        System.out.println(str.toString().toUpperCase()+" "+str1.toString().toUpperCase());
        System.out.println(str.replace(0,5,"HELLO")+" "+str1.replace(0,5,"WORLD"));

        StringBuilder sent = new StringBuilder("Hello");
        sent.append(" world");
        System.out.print(sent.toString().toUpperCase());

    }
    }

