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
            String str=S.replaceAll("[- !@#$%^&*()]","");

           var str1= str.substring(0,3).concat("-");
           var str2 = str.substring(3,6).concat("-");
           var str3 = str.substring(6,9).concat("-");
           var str4 = str.substring(9);
           var s = str1.concat(str2).concat(str3).concat(str4);
return s;
        }
}
