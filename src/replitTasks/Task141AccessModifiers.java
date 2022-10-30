package replitTasks;

public class Task141AccessModifiers {
    /*
    Create the maxValue method that will accept int array and return return the maximum value in the array.
    Method should visible every class in any package!
     */
   public static int maxValue(int[] array){
       int maxArr = 0;
        for (int i=0; i< array.length; i++){
            if (array[i]>maxArr){
                maxArr=array[i];
            }
        }
        return maxArr;
    }


    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
