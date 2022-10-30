package practice;

public class Repl159 {

//    Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
//    In main method execute all 3 methods to match the output:


   /* void print(int a, int b, int c){
        System.out.println(a-b-c);
    }
    void print(int a, int b, int c,int d){
        System.out.println(a-b-c-d);
    }
    void print(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        Repl159 obj=new Repl159();
        obj.print(10,5);
        obj.print(10,2,3);
        obj.print(10,2,3,3);
    }*/
}
class Parent{
    /*
    In Parent Class create a method with name method() that will print  "Parent method"
    Override method() in Child class that will print "Child method"
    In Main Class create objects of child and parent class and call its method.
     */
    /*void method(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    void method(){
        System.out.println("Child method");
    }
}
class Main1{
    public static void main(String[] args) {
        Parent obj=new Child();
        obj.method();

    }*/
}
class Repl166{}
   /* Create a class Animal in which define instance variable type, constructor that will initialize instance
   variables and 2 methods eat and sleep.
        Create a subclass Cat in which override method sleep
        Create 3 Kitten subclasses of a Cat class and override method eat
        for 1 kitten - eats milk
        for 2 kitten - eats snack
        for 3 kitten - eats everything
        In main method create object of Cat class and all 3 kittens classes and store into an array of Animals.
        Call available methods:*/
/*class Animal{
    String type;
    Animal(String type){
        this.type=type;
    }
    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("sleep");
    }
   }
   class Cat extends Animal{
        Cat(String type){
            super(type);
        }
       void sleep(){
           System.out.println(type+" sleep");
       }
   }
   class Kitten1 extends Cat{
       Kitten1(String type) {
           super(type);
       }
       void eat(){
           System.out.println(type+" eats milk");
       }
   }
class Kitten2 extends Cat{
    Kitten2(String type) {
        super(type);
    }
    void eat(){
        System.out.println(type+" eats snacks");
    }
}
class Kitten3 extends Cat{
    Kitten3(String type) {
        super(type);
    }
    void eat(){
        System.out.println(type+" eats everything");
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Cat obj1=new Cat("Cat");
        Kitten1 obj2=new Kitten1("Kitten1");
        Kitten2 obj3=new Kitten2("Kitten2");
        Kitten3 obj4=new Kitten3("Kitten3");
        //Animal[] array={new Cat("Cat"),new Kitten1("Kitten1"),new Kitten2("Kitten2"),new Kitten3("Kitten3")};
        Animal[] arr={obj1,obj2,obj3,obj4};
        for (int i=0;i< arr.length; i++){
            arr[i].eat();
            arr[i].sleep();
        }
    }
}*/

/*class Animal{
    String type;
    Animal(String type){
        this.type=type;
    }
    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}
class Cat extends Animal{
    Cat(String type) {
        super(type);
    }
    void sleep(){
        System.out.println("sleep");
    }
}
class kitten1 extends Cat{
    kitten1(String type){
        super(type);
    }
    void eat(){
        System.out.println(type + "eats");
    }
}
class kitten2 extends Cat {
    kitten2(String type) {
        super(type);
    }

    void eat() {
        System.out.println(type + "eats snacks");
    }
    class kitten3 extends Cat {
        kitten3(String type) {
            super(type);
        }

        void eat() {
            System.out.println(type + "eats everything");
        }
    }
    class AnimalTester {
        public static void main(String[] args) {
            Cat obj1 = new Cat("Cat");
            kitten1 obj2 = new kitten1("Kitten1");
            kitten2 obj3 = new kitten2("Kitten2");
            kitten3 obj4 = new kitten3("Kitten3");
            Animal[] arr = {obj1, obj2, obj3, obj4};
            for (int i = 0; i < arr.length; i++) {
                arr[i].eat();
                arr[i].sleep();
            }
        }
    }*/
class Main1 {
    static String maxLength(String[] arr){
        String largestString="";
        for (int i=0; i< arr.length-1; i++){
            if(arr[i+1].length()>arr[i].length()){
                largestString=arr[i+1];
            }
        }
        return largestString;
    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}


