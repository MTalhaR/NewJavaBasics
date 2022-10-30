package com.syntax.class19;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses
    // MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
    String name;
    int students;
    String subject;

    public Teacher(String name, int students, String subject) {
        this.name = name;
        this.students = students;
        this.subject = subject;
    }
    void info(){
        System.out.println(name+" has "+students+" students and he teaches "+subject);
    }
}
class MathTeacher extends Teacher{
    String promotion;

    public MathTeacher(String name, int students, String subject, String promotion) {
        super(name, students, subject);
        this.promotion = promotion;
    }
    void promotion(){
        System.out.println(name+" is most likely to get promoted to "+promotion);
    }
}
class ChemistryTeacher extends Teacher{
        int highestScore;
    public ChemistryTeacher(String name, int students, String subject, int highestScore) {
        super(name, students, subject);
        this.highestScore=highestScore;
    }
    void score(){
        System.out.println("In "+subject+" hamza got highest score of "+highestScore);
    }
}
class PianoTeacher extends Teacher{
    String play;
    public PianoTeacher(String name, int students, String subject, String play) {
        super(name, students, subject);
        this.play=play;
    }
    void piano(){
        System.out.println(name+" will play the "+play);
    }
}
class testerClass{
    public static void main(String[] args) {
       new Teacher("Talha", 50, "History").info();
        new PianoTeacher("Adnan", 40, "Music", "Piano").piano();
         new MathTeacher("Hamza", 35, "Math", "Head Master").promotion();
         new ChemistryTeacher("John", 25, "Chemistry", 94).score();
    }
}