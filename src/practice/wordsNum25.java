package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class wordsNum25 {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        for (int i=1;i<=500; i++){
            if (i%2==0){
                obj.add(i);
            }
        }
        //System.out.println(obj);
        Iterator<Integer> iterator = obj.iterator();
        while (iterator.hasNext()){
            var item=iterator.next();
                if (item%5==0){
                    iterator.remove();
                }
            }
        System.out.println(obj);
        }
    }

    class num25 {
        public static void main(String[] args) {
            ArrayList<Integer> obj = new ArrayList<>();
            for (int i = 2; i <= 500; i += 2) {
                if (i % 5 != 0) {
                    obj.add(i);
                }
            }
            System.out.println(obj);
        }
    }
