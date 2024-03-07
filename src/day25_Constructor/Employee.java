package day25_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, int age, char gender, String jobTitle,
                    double salary, LocalDate hired_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hired_date = hired_date;
    } // allows us to set the instance variables of the objects as soon as the object created

    public String toString() {
        return "\n\tEmployee: " +
                "\nname: " + name +
                "\nage: " + age +
                "\ngender: " + gender +
                "\njob Title: " + jobTitle +
                "\nsalary: " + salary +
                "\nhired date: " + hired_date.format(DateTimeFormatter.ofPattern("MMMM/dd/y"));
    }// allows us to print the object its passed in the print statement
}
/*
name
age
gender
jobTitle
salary
hired date
 */
