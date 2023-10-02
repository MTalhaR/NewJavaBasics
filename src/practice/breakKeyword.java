package practice;

public class breakKeyword {
        public void method(int number){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    if (j==number){
                        System.out.println(number);
                    }
                }
            }
    }
    public static void main(String[] args) {
        breakKeyword obj = new breakKeyword();
        obj.method(1);
    }
    public void publicMethod(){

    }
    void defaultMethod(){

    }
     protected String protectedMethod(){
            String var = null;
            return var;
    }

}
