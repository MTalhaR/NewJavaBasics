package practice;

public class inheritance  {
    String name = "talha";
    public inheritance(String name1){
        name1 = this.name;
        this.print();
    }

    public void print(){
        System.out.println("name is talha");
    }

    public void address(){
        System.out.println("address is isb");
    }
    public void city(){
        System.out.println("city is lhr");
    }
    public void street(){
        System.out.println("street is new");

    }

    public String message(){
        String car = "audi";
        return car;
    }
}
