package day28_encapsulation.personTask;

import java.lang.management.PlatformLoggingMXBean;

public class testPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Mohammad");
        Person person2 = new Person("Abdullah", 'M');
        Person person3 = new Person("Hasan", 30);
        Person person4 = new Person("Daneil", "English");
        Person person5 = new Person("Tatian", 25, 'F');
        Person person6 = new Person("Lucy", 31, 'F', "English");

        person4.name = "Reece James";
        //person1.planet = "Mars";
        Person.planet = "Mars";

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person1.eat("Cake");
        person2.drink("Ayran");
        person5.drink("tea");

    }

}
