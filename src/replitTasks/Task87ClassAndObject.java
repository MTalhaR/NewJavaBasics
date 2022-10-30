package replitTasks;
    public class Task87ClassAndObject {
    /*
    Create a class named 'Main' with specific attributes.
    Create two objects of that class in which you will be assigning the following values and then print them.
    */
    String Color;
    int Year;
    String Make;

        public static void main(String[] args) {
            Task87ClassAndObject car1=new Task87ClassAndObject();
            car1.Color="Black";
            car1.Make="BMW";
            car1.Year=2019;
            System.out.println("Car color is "+car1.Color+" and car year is "+car1.Year+" and car model is "+car1.Make);

            Task87ClassAndObject car2=new Task87ClassAndObject();
            car2.Color="White";
            car2.Make="Toyota";
            car2.Year=2018;
            System.out.println("Car color is "+car2.Color+" and car year is "+car2.Year+" and car model is "+car2.Make);
        }

}
