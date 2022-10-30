package Quiz03StringAndStringManipulations;

public class Q12 {
    public static void main(String[] args) {

        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", "");

        System.out.println(replace);


    }
}
