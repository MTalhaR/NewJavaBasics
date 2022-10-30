package practice;

public class arr2D {
    //public static void main(String[] args) {}
        //String[] arr = {"i'm here", "How are you", "nice to meet you btw", "bye"};

        /*private static String[] reverseMany(String[] strings) {
            String[] result = new String[strings.length];
            for (int j = 0; j < strings.length; ++j) {
                result[j] = reverseString(strings[j]);
            }
            return result;
        }*/

    // function that reverses array and stores it
    // in another array
   /* static void reverse(String a[], int n)
    {
        String[] b = new String[n];
        int j = n;
        String nul="";
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
            for(int z=b.length-1; z>=0; i--){
                nul+=b[z];
            }
        }
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
    public static void main(String[] args)
    {

        String [] arr = {"Hello", "How are you", "nice to meet you", "Bye"};
        reverse(arr, arr.length);
    }*/
    public static void main(String[] args) {
        int[][] arr={{2,3,4},
                {5,6,7,5},
                {7,8,9,6,2356,3454}};
        for(int i=0; i<arr.length;i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    }

