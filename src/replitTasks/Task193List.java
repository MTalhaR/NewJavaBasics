package replitTasks;

import java.util.LinkedList;

/*Create Linked List that will store Integer Objects
        Add the values below:
        111
        222
        333
        444
        555
        666
        Create a logic to calculate sum of the all the values in list
        Print the result of sum.*/
public class Task193List {
        public static void main(String[] args) {
                LinkedList<Integer> obj=new LinkedList<>();
                obj.add(111);
                obj.add(222);
                obj.add(333);
                obj.add(444);
                obj.add(555);
                obj.add(666);
                int sum=0;
                for (int i=0;i<obj.size();i++){
                       sum+=obj.get(i);
                }
                System.out.println("Result of sum is "+sum);

        }
}
