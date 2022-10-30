package practice;

public class Faiza {
}
abstract class Marks {
    int maths;
    int english;
    int coding;
    Marks(int maths, int english, int coding) {
        this.maths = maths;
        this.english = english;
        this.coding = coding;
    }
    abstract double getPercentage();
}
class AA extends Marks{
    int totalMarks=300;
    AA(int maths,int english,int coding){
        super(maths, english, coding);
    }

    @Override
    double getPercentage() {
        double  getPercentage=(((maths+english+coding)/totalMarks));
        return getPercentage;
    }
}
class BB extends Marks{
    int totalMarks=400;
    int geo;
    BB(int maths,int english,int coding,int geo){
        super(maths, english, coding);
        this.geo=geo;
    }
    @Override
    double getPercentage() {
        double  getPercentage=(((maths+english+coding+geo)/totalMarks)*100);
        return getPercentage;
    }
}
class MarksTest{
    public static void main(String[] args) {
        Marks faiza=new AA(55,65,56);
        System.out.println(faiza.getPercentage());
        Marks Yousuf=new BB(77,88,99,88);
        System.out.println(Yousuf.getPercentage());
    }
}
