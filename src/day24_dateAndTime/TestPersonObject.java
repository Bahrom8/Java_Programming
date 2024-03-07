package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Jonathan",'M', LocalDate.of(1992,11,25));
        people[2].setInfo("Ariana", 'F', LocalDate.of(1995,7,17));
        people[3].setInfo("Rihanna", 'F', LocalDate.of(1975,12,22));
        people[4].setInfo("Bakhom", 'M',LocalDate.of(1997,4,8));

        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));

        // print name & date of birth of each person object
        for (Person each : studentList) {
            System.out.println(each.name + ": " + each.dateOfBirth);
        }

        System.out.println("---------------------------------------------");

        // remove all the person object that has the age > 55

        studentList.removeIf( p ->  p.age >= 55);
        for (Person person : studentList) {
            System.out.println(person.name + ": " + person.age);
        }

    }

}
