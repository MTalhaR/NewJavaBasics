package com.syntax.class17;

public class HW2Students {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
    with different marks. Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.
     */
    String name;
    int english;
    int maths;
    int bio;

    public HW2Students(String newname, int newenglish, int newmaths, int newbio) {
        name = newname;
        english = newenglish;
        maths = newmaths;
        bio = newbio;
    }
    void average(){
        System.out.println("Average score of "+name+" is "+ (english+maths+bio)/3);
    }
}
