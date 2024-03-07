package day25_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried, isEmployed;


    public Person(String name, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "\n\tPerson Info " +
                "\nname: " + name +
                "\nage: " + (LocalDate.now().getYear()-dateOfBirth.getYear())+
                "\ngender: " + gender +
                "\ndate Of Birth: " + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                "\nisMarried: " + isMarried +
                "\nis Employed: " + isEmployed;
    }
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink );
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }


}
/*
5 persons

name, age, gender,dateOfBirth (mm//dd/yyyy) , isMarried, isEmployed

add constructor that can set all the fields once an objects is created

toString(), eat(String Food), sleeping(), drink(String water)

 */