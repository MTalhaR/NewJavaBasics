package ReplInterview;

/* Reverse the number
Input[123] ->output [321]
Input[12345] ->output [54321]
Input[1001] ->output [1001]
Input[789] ->output [987] */
public class R225ReverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseInteger(12345));
    }

    public static int reverseInteger(int N) {
        int revInt = 0;
        /*while (N > 0) {
            int mod = N % 10;
            revInt = revInt * 10 + mod;
            N = N / 10;
        }*/
        String numbers="";
        String num=String.valueOf(N);
        String[] str=num.split("");
        for (int i = str.length-1; i >=0 ; i--) {
            numbers+=str[i];
        }
        //String q = new String(numbers);
        int r = Integer.parseInt(numbers);
        return r;
    }
}
