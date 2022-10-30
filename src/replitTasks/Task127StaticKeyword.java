package replitTasks;

public class Task127StaticKeyword {
    /*
    Create two methods:
    The first method should be a non-static method that will print out the following message:
    "Programming is amazing."
    The second method should be a static method that will print out the following message:
    "Java is awesome."
    Execute both methods
     */
    void print(){
        System.out.println("Programming is amazing.");
    }
    static void print1(){
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {
        Task127StaticKeyword value=new Task127StaticKeyword();
        value.print();
        Task127StaticKeyword.print1();
    }
}
