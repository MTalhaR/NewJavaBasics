package ReplInterview;
    /* Write the logic to format the string in the below given format
    xxx-xxx-xxx
    after each 3 digits ther should be dash("-")
    if there are any spaces in the input remove those
    input ["00-44   48 555555"]
    output ["004-448-555-555"]
    input ["00-44   48 555"]
    output["004-448-555"]
    input ["00-44  #$% 48 55"]
    output ["004-448-55"] */
public class R220FormatString {
        public static void main(String[] args) {
            System.out.println(formatString("00-44   48 555555"));
        }
        public static String formatString(String S){
String s="";
            String str=S.replaceAll("[^0-9]","");
            for (int i = 0; i < str.length(); i++) {
                if (i%3==0 && i!=0){
                   s+="-";
                }
                s+=str.charAt(i);
            }

return s;
        }
}
