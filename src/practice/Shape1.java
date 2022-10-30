package practice;

public class Shape1 {
    //Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code
    double radius;
    Shape1(double radius){
        this.radius=radius;
    }

}
class Circle1 extends Shape1{
    Circle1(double radius){
        super(radius);
    }

    void area(){
        double pi=3.14;
        double area=pi*radius*radius;
        System.out.println(area);
    }

}
class testArea{
    public static void main(String[] args) {
        Circle1 obj=new Circle1(10.1);
        obj.area();
    }
}
