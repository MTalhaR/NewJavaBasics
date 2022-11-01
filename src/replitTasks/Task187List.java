package replitTasks;

import java.util.ArrayList;
import java.util.Iterator;

/*Create an array list to type String.
        Add these values below to your arraylist
        hi
        yo
        sup
        yolo
        boop
        Remove 1, 3, 5 element from an array
        print remained values one by one in one line*/
public class Task187List {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<>();
        obj.add("hi");
        obj.add("yo");
        obj.add("sup");
        obj.add("yolo");
        obj.add("boop");
        obj.remove("hi");
        obj.remove("sup");
        obj.remove("boop");
        for(int i=0;i<obj.size();i++){
            System.out.print(obj.get(i)+" ");
        }
        /*var iterator = obj.iterator();
        while (iterator.hasNext()){
            String item=iterator.next();
            if(item.equals("hi")||item.equals("sup")||item.equals("boop")){
                iterator.remove();
            }
        }
        System.out.print(obj.get(0)+" ");
        System.out.print(obj.get(1));*/
    }
}
