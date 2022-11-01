package replitTasks;

import java.util.ArrayList;
import java.util.Scanner;

/* Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
        Numbers in:
        4
        62
        8
        5
        4*/
    public class Task188List {
        public static void main(String[] args) {
            ArrayList<Integer> obj=new ArrayList<>();
            Scanner scan=new Scanner(System.in);
            for(int i=1;i<=5;i++){
               int num=scan.nextInt();
                obj.add(num);
            }

            for(int j=0;j<obj.size();j++){
                System.out.print(obj.get(j)+" ");
            }

        }
}
