package practice;

public class A {
        A(int a){
            System.out.println(a);
        }
    }
    class B extends A{

        B(int a, int b){   //declare all the variables which were present in the parent constructor, in the child constructor ()
            super(a);// Always call parent constructor in child constructor using super keyword
                        // and write the names of variables in the parent class inside super();

            System.out.println(b);
        }
    }
    class C extends B{
    int c;
        C(int a, int b, int c){
            super(a,b);
            this.c=c;
            System.out.println(c);
        }
    }
class testABC{
    public static void main(String[] args) {

    }
}
