package replitTasks;

public class Task88ClassAndObject {
    /*
    In this class, you should specify the following attributes: breed, name, color, and following behaviors:
    bark(), run(), play().
    Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
    */
    String breed;
    String name;
    String color;
    void bark(){ System.out.println(breed+" can bark"); }
    void run(){ System.out.println(breed+" can run"); }
    void play(){ System.out.println(breed+" can play"); }

    public static void main(String[] args) {
        Task88ClassAndObject dog1=new Task88ClassAndObject();
        dog1.breed="Husky";
        dog1.bark();
        dog1.run();
        dog1.play();

        Task88ClassAndObject dog2=new Task88ClassAndObject();
        dog2.breed="Bulldog";
        dog2.bark();
        dog2.run();
        dog2.play();

        Task88ClassAndObject dog3=new Task88ClassAndObject();
        dog3.breed="Labrador";
        dog3.bark();
        dog3.run();
        dog3.play();
    }


}
