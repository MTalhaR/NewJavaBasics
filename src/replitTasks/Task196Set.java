package replitTasks;

import java.util.HashMap;
import java.util.HashSet;

/*
Create a Set and and below values to it.

[third, first, second]

Print HashSet and then remove all the elements from Hashset and print it again.
 */
public class Task196Set {
    public static void main(String[] args) {
        HashSet<String> values=new HashSet<>();
        values.add("third");
        values.add("first");
        values.add("second");
        System.out.println(values);
        values.removeAll(values);
        System.out.println(values);
    }
}
