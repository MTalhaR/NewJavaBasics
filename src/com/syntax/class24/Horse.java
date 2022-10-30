package com.syntax.class24;

public class Horse {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private String color;

    public Horse(String name, String breed, int age, double weight, String color) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Name is not provided.");
        }else {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Age can't be negative");
        } else if (age>20) {
            System.out.println("Age can't be greater than 20. Provide correct age");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<5){
            System.out.println("Weight can't be less than 5 pounds");
        } else if (weight>800) {
            System.out.println("Weight can't be more than 800 pounds");
        } else {
            this.weight = weight;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void printInfo(){
        System.out.println("Name is "+name+"\n"+"Breed is "+breed+"\n"+"Age is "+age+"\n"+"Weight is "+weight+"\n"+"Color is "+color);
    }
}

class testHorse{
    public static void main(String[] args) {
        Horse obj=new Horse("Mikey","Gypsy", 20, 385, "White");
        obj.printInfo();
        System.out.println(obj.getAge());
    }
}
