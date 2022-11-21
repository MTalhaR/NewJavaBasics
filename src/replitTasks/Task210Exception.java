package replitTasks;
/* Complete the code, handle possible exception
**Expected Output:**
/ by zero */
public class Task210Exception {
        public static void main(String[] args) {
            int a=10, b=0;
            try {
                int result;
                result = a/b;
            } catch (Exception e){
                System.out.println("/ by zero");
            }
        }
    }

