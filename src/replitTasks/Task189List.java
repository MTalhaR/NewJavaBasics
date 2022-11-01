package replitTasks;

import java.util.Iterator;
import java.util.LinkedList;

/*Create a Linked List that will store Integer Objects from 50-100.
        Once Linked List is created remove all numbers that are not divisible by 3.
        Print Linked List*/
    public class Task189List {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            obj.add(i);
        }
        var iterator = obj.iterator();
        while (iterator.hasNext()) {
            var num = iterator.next();
                if (num % 3 != 0) {
                    iterator.remove();
                }
            }
            System.out.println(obj);
        }
    }

