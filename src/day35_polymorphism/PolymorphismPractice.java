package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Tiger Khan", "Wild Tiger", 'M', 3, "Large", "Black and Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //tiger.hunt();

        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        // animal.fly();
        animal.eat();
        animal.sleep();
        animal.drink();


        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");;
        //obj1.eat();
        // obj1.drink();
        // obj1.sleep();
        obj1.fly();
        System.out.println(obj1.canFly);


        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = { parrot, eagle, duck};

        Swimmable[] fishes = {dolphin, shark, duck};

        Playable[] friendlyAnimals = {dog, cat, duck};


        boolean isAnimal = dog instanceof Animal;


        System.out.println(isAnimal);

        System.out.println("------------------------------------------------");

        Car car = new Tesla("Tesla", "Model Y", "White", 2020, 55000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;


        System.out.println("is Tesla = " + isTesla);
        System.out.println("is Audi = " + isAudi);
        System.out.println("is Electric Car = " + isElectricCar);
        System.out.println("has Auto Park = " + hasAutoPark);
        System.out.println("has Auto Pilot = " + hasAutoPilot);

        System.out.println("------------------------------------------------");



    }


}
