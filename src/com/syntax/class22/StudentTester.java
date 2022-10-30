package com.syntax.class22;

public class StudentTester {
    public static void main(String[] args) {
        Student [] studentObject = {new SyntaxStudent() , new CollegeStudent() , new SchoolStudent()};
        for (Student individualObjects : studentObject){
            individualObjects.studentType();
            individualObjects.studentSalary();
        }
    }
}
