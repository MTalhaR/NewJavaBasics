package replitTasks;

import java.util.Scanner;

public class Task104StringManipulations {
    /*
    Create an array of names that will hold 5 String elements.  Names must be taking from a user.
    Print out the first three characters of each element of the array, one per line.
    Note: every array element must be at least 3 characters long.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String [] names=new String[5];
        for ( int i=0; i<names.length; i++){
        names[i]=scan.next();
            System.out.println(names[i].substring(0,3));
        }


    }

}
