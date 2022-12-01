package ReplInterview;
    /* Reverse the String without using the Reverse method from the BtringBuilder Class
    input["I am a java Programmer"] output["Programmer java a am I"]
    input["Syntax is Great"] output["Great is Syntax"] */
public class R226ReverseString {
    public static void main(String[] args) {

        System.out.println(reverse("Syntax is Great"));
  }
   public static String reverse(String strToRev){
        String rev = "";
        String[] arr=strToRev.split(" ");
       for (int i = arr.length-1; i >= 0; i--) {
           rev+=arr[i]+" ";
       }
       /*for (int i = 0; i < arr.length; i++) {
        rev=arr[i]+" "+rev;
       }*/
        return rev.trim();
   }
}
