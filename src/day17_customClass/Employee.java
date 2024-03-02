package day17_customClass;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jonTitle;
    public double salary;
    public String id;

    public void setInfo(String name, int age, char gender, String jonTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jonTitle = jonTitle;
        this.salary = salary;
        this.id = id;
    } // sets all the attributes of hte employee object at once


    public String toString() { // to avoid getting hash code when we print employee object
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jonTitle='" + jonTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    public void work (){
        System.out.println(name + " is working" );
    }


}

