package practice;

public class teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses
    // MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes

    String name;
    String schoolName;
    int studentsNo;
    boolean friendly;

    public teacher(String name, String schoolName, int studentsNo, boolean friendly) {
        this.name = name;
        this.schoolName = schoolName;
        this.studentsNo = studentsNo;
        this.friendly = friendly;
    }
}
class MathTeacher extends teacher{
    int MaxScore;
    MathTeacher(String name, String schoolName, int studentsNo, boolean friendly, int MaxScore){
        super(name,schoolName, studentsNo,friendly);
        this.MaxScore=MaxScore;
    }
    void print(){
        System.out.println(name+" "+schoolName+" "+studentsNo+" "+friendly+" "+MaxScore);
    }
}
class ChemistryTeacher extends teacher{
    boolean chemicalPresent;

    public ChemistryTeacher(String name, String schoolName, int studentsNo, boolean friendly, boolean chemicalPresent) {
        super(name, schoolName, studentsNo, friendly);
        this.chemicalPresent=chemicalPresent;
    }
    void print(){
        System.out.println(name+" "+schoolName+" "+studentsNo+" "+friendly+" "+chemicalPresent);
    }
}
class PianoTeacher extends teacher {
    String music;

    public PianoTeacher(String name, String schoolName, int studentsNo, boolean friendly, String music) {
        super(name, schoolName, studentsNo, friendly);
        this.music=music;
    }
    void print(){
        System.out.println(name+" "+schoolName+" "+studentsNo+" "+friendly+" "+music);
    }
}
class tesTeacher{
    public static void main(String[] args) {
        PianoTeacher obj=new PianoTeacher("talha", "colleg", 50, true, "piano");
        obj.print();
        MathTeacher obj1=new MathTeacher("khan","uni", 30,true,98);
        obj1.print();
        ChemistryTeacher obj2=new ChemistryTeacher("masiha","oxford",42,true,true);
        obj2.print();
    }
}
