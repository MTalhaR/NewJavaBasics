package practice;

public class reverseStringPractice {
    public static void main(String[] args) {
        reverseString("Love");
        revStr("Love");
        System.out.println(reverse3("Love this"));

    }
    public static void reverseString(String rev){

        StringBuilder str = new StringBuilder(rev);


        System.out.println(str.reverse());


    }
    public static void revStr(String rev){

        char[] arr = rev.toCharArray();
        String reverse = "";

        for(int i= arr.length-1; i>=0; i--) {
            reverse += arr[i];
        }

        System.out.println(reverse);
    }
    public static String reverse3(String str){
        String[] arr = str.split(" ");
        String res = "";

        for(int i = arr.length-1; i >= 0; i--){
            res+=arr[i];

        }
        return res;
    }
}
//*[@id="nav-hamburger-menu"]