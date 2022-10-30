package Quiz03StringAndStringManipulations;

public class Q15 {
    /*
    The isEmpty() method checks whether a string is empty or not. What does it return if given String is empty?
Group of answer choices

b) false

b) true

d) empty space

a) 0
     */
    public static void main(String[] args) {
        String a="";
        String b="   ";
        System.out.println(a.isEmpty());
        System.out.println(a.isBlank());
        System.out.println(b.isBlank());
        System.out.println(b.isEmpty());
    }
}
