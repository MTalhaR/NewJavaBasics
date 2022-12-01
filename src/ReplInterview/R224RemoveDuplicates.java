package ReplInterview;
    /* Remove Consecutive duplicates
    Write the logic to remove only consecutive duplicates
    input ["aabbcde"]-> output["abcde"]
    input ["aabbcc"]-> output["abc"]
    input ["aabbcca"]-> output["abca"]
    input ["aabbccaddda"]-> output["abcada"] */
public class R224RemoveDuplicates {
        public static void main(String[] args) {

            System.out.println(removeConsecutiveDuplicates("aabbccaddda"));
        }

        public static String removeConsecutiveDuplicates(String input) {
            String duplicates="";
            String[] letters=input.split("");
            for (int i = 0; i < letters.length-1; i++) {
                if((!letters[i].equals(letters[i+1])) || (!duplicates.contains(letters[i]))){
                    duplicates+=letters[i+1];
                }
            }
            return duplicates;
        }
}
