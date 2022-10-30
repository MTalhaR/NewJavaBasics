package G12Project2;
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculate Perimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.
    */
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class circle implements Shape{
    double radius=5;
    @Override
    public void calculateArea() {
        //System.out.println("Area of Circle is "+(3.14*5*5));
        System.out.println("Area of Circle is "+(Math.PI*radius*radius));
        //System.out.println("Area of Circle is "+(Math.PI*Math.pow(5,2)));
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Circle is "+ (2*Math.PI*radius));
       // System.out.println("Perimeter of Circle is "+ (2*Math.PI*5));
    }
}
class Square implements Shape{
    int side=5;
    @Override
    public void calculateArea() {
        System.out.println("Area of Square is "+(2*side));
       //System.out.println("Area of Square is "+(Math.addExact(5,5)));
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Square is "+(4*side));
       // System.out.println("Perimeter of Square is "+(2*Math.addExact(5,5)));
    }
}
class TestShape{
    public static void main(String[] args) {

        Shape[] arr={new circle(),new Square()};
        for (Shape obj:arr){
            obj.calculateArea();
            obj.calculatePerimeter();
        }
    }
}
