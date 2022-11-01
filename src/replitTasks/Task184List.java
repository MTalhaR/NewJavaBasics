package replitTasks;

import java.util.ArrayList;
import java.util.Iterator;

/*Create a array list that will hold Integer Objects:
        Add below elements to it.
        111
        222
        333
        444
        555
        666
        Print first, third and fifth element from your array*/
public class Task184List {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(111);
        obj.add(222);
        obj.add(333);
        obj.add(444);
        obj.add(555);
        obj.add(666);
        System.out.println(obj.get(0));
        System.out.println(obj.get(2));
        System.out.println(obj.get(4));
    }
}
