package day31_inheritnace.animal_MethodOverriding;

public class TestAnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Emily", "Bengal", 'F', 2, "Medium", "Tiger");

        Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");

        Lion lion = new Lion("Simba", "African Lion", 'M',6,"Large", "Orange", true);

        Eagle eagle = new Eagle("Bella", "White Head", 'F', 2, "Medium", "Black and White");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("----------------------------------");

        cat.eat();
        dog.eat();
        lion.eat();
        eagle.eat();

        System.out.println("----------------------------------");

        cat.sleep();
        dog.sleep();
        lion.sleep();
        eagle.sleep();

        System.out.println("----------------------------------");
    }

}
