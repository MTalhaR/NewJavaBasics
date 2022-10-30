package G12Project2;
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average
    percentage of marks. Provide implementation of abstract method in classes 'A' and 'B' The constructor of
    student A takes the marks in three subjects as its parameters and the marks in four subjects as its
    parameters for student B. Test your code
    */
public abstract class Marks {
    abstract double getPercentage();
}
class StudentA extends Marks{
    double grade1;
    double grade2;
    double grade3;
    StudentA(double grade1,double grade2,double grade3){
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
    }
    @Override
    double getPercentage() {
        double percentage=((grade1+grade2+grade3)/3);
        System.out.println("Average of Student A is "+percentage+"%.");
        return percentage;
    }
}
class StudentB extends Marks{
    double grade1;
    double grade2;
    double grade3;
    double grade4;
    StudentB(double grade1,double grade2,double grade3,double grade4){
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
        this.grade4=grade4;
    }
    @Override
    double getPercentage() {
        double percentage=((grade1+grade2+grade3+grade4)/4);
        System.out.println("Average of Student B is "+percentage+"%.");
        return percentage;
    }
}
class TestMarks{
    public static void main(String[] args) {
        Marks[] arr={new StudentA(87,92,89),new StudentB(97,93,90,81)};
        for (Marks obj:arr){
            obj.getPercentage();
        } 
    }
}

/*class StudentB extends StudentA{
    double grade4;
    StudentB(double grade1, double grade2, double grade3,double grade4) {
        super(grade1, grade2, grade3);
        this.grade4=grade4;
    }
    @Override
    double getPercentage() {
        double percentage=(grade1+grade2+grade3+grade4)/4;
        System.out.println("Average of Student B is "+percentage+"%.");
        return percentage;
    }
}*/

