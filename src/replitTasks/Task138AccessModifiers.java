package replitTasks;

/*
    In AnotherClass declare a private, default, protected, public methods
    and have them each return the name of the what access modifier they are using.
    All methods should be accessible by class name
    Call methods of Another class inside Main class
     */
class AnotherClass{
    private String privateMethod(){
        return "private";
    }
    String defaultMethod(){
       String s="default";
       return s;
    }
    protected String protectedMethod(){
        return "protected";
    }
    public String publicMethod(){
    return "public";
    }
}
    public class Task138AccessModifiers {
        public static void main(String[] args) {
            System.out.println(new AnotherClass().defaultMethod());
            System.out.println(new AnotherClass().protectedMethod());
            System.out.println(new AnotherClass().publicMethod());
            //System.out.println(new AnotherClass().privateMethod());
        }
}
