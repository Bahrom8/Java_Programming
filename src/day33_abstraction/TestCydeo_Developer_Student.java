package day33_abstraction;

import day27_accessModifiers.CydeoStudents;

import java.time.LocalDate;

public class TestCydeo_Developer_Student {

    public static void main(String[] args) {

        Cydeo_Developer_Student student1 = new Cydeo_Developer_Student("Bakhrom", 'M',
                LocalDate.of(1997, 4, 8), "A01",
                "Zero to Hero", 2);

        System.out.println(student1);
        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();


    }

}
