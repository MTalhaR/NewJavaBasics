package group12Project;

public class Task06 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

        int a =15;
        int b= 30;


        // without using temporary available

        a=a+b; // 45
        b=a-b; //15
        a=a-b; //30

       
        System.out.println(a);
        System.out.println(b);

	}

}
