package replitTasks;

import java.util.LinkedList;

/*Create Linked List that will store first 10 numbers of fibonacci series
        Print number from Linked List 1 by 1 all in 1 line*/
    public class Task190List {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        obj.add(0);
        obj.add(1);
        int a = 0, b = 0, c = 1;
        for (int i = 1; i <= 8; i++) {
            a = b;
            b = c;
            c = a + b;
            obj.add(c);
        }
        for (int value : obj) {
            System.out.print(value + " ");
        }
    }
}
