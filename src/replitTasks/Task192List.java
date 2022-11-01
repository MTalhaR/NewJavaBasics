package replitTasks;

import java.util.LinkedList;

/* Create an Linked List that will store all prime numbers from 1 to 100
        Step 1. Create a method that will identify wether number is prime or not
        Step 2. Add all prime numbers into Linked List
        Print Linked List:*/
public class Task192List {
       public static void main(String[] args) {
              LinkedList<Integer> obj=new LinkedList<>();
              for (int i=2; i<=100; i++){
                     int prime=0;
                     for (int j=2; j<i; j++) {
                            if(i%j==0) {
                                   prime++ ;
                            }
                     }
                if (prime==0){
                       obj.add(i);
                }
              }
              System.out.println(obj);
       }
}
