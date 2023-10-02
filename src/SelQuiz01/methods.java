package SelQuiz01;


import practice.inheritance;


public class methods extends inheritance {
    public static void main(String[] args) {
//        inheritance obj = new inheritance();
//        obj.print();
        methods obj = new methods();


    }
    methods(){
        super("talha");
    }
public void method(){
        super.city();
}
    @Override
    public void address() {
        super.address();
        System.out.println("address is old");
    }
}
