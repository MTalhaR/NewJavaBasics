package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Salat {
    String [] name = {"Fajar","Maghrib","Isha","Zuhar","Asar"} ;
    int [] noOfFarz={2,3,4,4,4};
    int [] noOfSunnah={2,2,6,6,4};

    public static void main(String[] args) throws FileNotFoundException {

            File file = new File("D:\\data.txt");
            Scanner sc = new Scanner(file);


            while (sc.hasNextLine())

              sc.nextLine();



        ArrayList<String> salat = new ArrayList<>();
        salat.add(sc.toString());



    }


}
