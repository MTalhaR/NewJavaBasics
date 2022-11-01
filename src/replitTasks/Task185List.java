package replitTasks;

import java.util.ArrayList;

/*Create an arrayList of type Integer.
        add below values.
        111
        111
        111
        999
        999
        999
        Print all the values of List 1 by 1:*/
    public class Task185List {
        public static void main(String[] args) {
            ArrayList<Integer> obj=new ArrayList<>();
            obj.add(111);
            obj.add(111);
            obj.add(111);
            obj.add(999);
            obj.add(999);
            obj.add(999);
            for (int i=0; i<obj.size(); i++){
                System.out.println(obj.get(i));
            }
        }
}
