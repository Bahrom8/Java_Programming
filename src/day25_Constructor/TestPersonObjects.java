package day25_Constructor;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Bakhrom", 'M', LocalDate.of(1997,04,8),true, true);
        Person person2 = new Person("Asal", 'F', LocalDate.of(1999,7,22),false, false);
        Person person3 = new Person("Mansur", 'M', LocalDate.of(1995,8,19),false, true);
        Person person4 = new Person("Malika", 'F', LocalDate.of(1989,12,30),true, true);
        Person person5 = new Person("Aziz", 'M', LocalDate.of(1991,9,1),true, false);

        System.out.println(person1);
        person1.eat("plov/osh");
        person1.drink("Hot tea");
        person1.sleep();

        System.out.println(person2);
        person2.eat("sushi");
        person2.drink("soda");
        person2.sleep();

        System.out.println(person3);
        person3.eat("lagman");
        person3.drink("tea");
        person3.sleep();

        System.out.println(person4);
        person4.eat("Spaghetti");
        person4.drink("water");
        person4.sleep();

        System.out.println(person5);
        person5.eat("Pizza");
        person5.drink("Sprite");
        person5.sleep();

    }

}
