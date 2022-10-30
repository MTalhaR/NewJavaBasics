package com.syntax.class22;
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
     */
public class Student {
    void studentType(){System.out.println("He is a student");}
    void studentSalary(){System.out.println("He is not being paid");}}
class SyntaxStudent extends Student{
    @Override
    void studentType(){System.out.println("He is a Syntax student");}}
class CollegeStudent extends Student{
    @Override
    void studentType() {System.out.println("He is a College student");}
    void studentSubject(){System.out.println("He is learning the Physics subject");}}
class SchoolStudent extends Student{
    @Override
    void studentType() {System.out.println("He is a School student");}
    void studentClass(){System.out.println("He is in class 5");}
    @Override
    void studentSalary() {System.out.println("He get monthly allowance");}}
