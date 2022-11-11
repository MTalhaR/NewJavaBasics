package replitTasks;

import java.util.HashSet;

public class Task195Set {
    public static void main(String[] args) {
        HashSet<Integer> num=new HashSet<>();
        num.add(111);
        num.add(111);
        num.add(111);
        num.add(999);
        num.add(999);
        num.add(999);
        num.add(999);
        for(Integer value:num){
            System.out.println(value);
        }
    }
}
