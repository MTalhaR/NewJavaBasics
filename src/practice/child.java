package practice;


public class child extends parent{
    public child(){
        super();
    }
String newVariable = "abc";
    public static void main(String[] args) {
        parent obj=new parent();
        obj.address3();
        child obj2 = new child();
        obj2.methods();

    }
    public void methods(){
        super.address3();
    }

}
