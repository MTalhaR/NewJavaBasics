package ReplInterview;
    /* Complete the function isBalanced in the editor below.
    isBalanced has the following parameter(s):
    string s: a string of brackets
    Returns
    string: either true or false
    **Examples**
    input "(()"  ->  false
    input "("  ->  false
    input ")"  ->  false
    input "(()))"  ->  false
    input "(())"  ->  true
    input "()"  ->  true
    input ")()("  ->  true */
public class R215BalancedParanthesis {
        public static void main(String[] args) {
            System.out.println(isBalanced("(()))"));
        }

        public static boolean isBalanced(String s){
            int count = 0;
            int count1 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)==('(')) {
                    count++;
                }
                else if (s.charAt(i)==(')')) {
                    count1++;
                }
            }
            if (count==count1){
                return true;
            }else

            return false;
        }

    }
