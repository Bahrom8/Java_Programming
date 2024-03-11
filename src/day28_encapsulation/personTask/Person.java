package day28_encapsulation.personTask;

public class Person {

    public String name, language;
    public int age;
    public char gender;

    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead, numberOfEyes;
    public static String planet;

    static {
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
        numberOfEyes = 2;
        planet = "Earth";
    }

    public Person(String name) { //Allows us to create Person object just by setting the name of the person
        this.name = name;
    }

    public Person(String name, int age) { //Allows us to create Person object just by setting the name and age of the person
        this(name);
        this.age = age;
    }

    public Person(String name, String language) { //Allows us to create Person object just by setting the name and language of the person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) { //Allows us to create Person object just by setting the name and gender of the person
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) { //Allows us to create Person object just by setting the name and age and gender of the person
        this(name, gender);
        this.age = age;
    }

    public Person(String name, int age, char gender, String language) {
        this(name, age, gender);
        this.language = language;

    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public static void printPlanetName() {
        System.out.println("We are living in the planet of " + planet);
    }

    public String toString() {
        return "\n\tPerson" +
                "\nname: " + name +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nlanguage: " + language +
                "\nplanet: " + planet;
    }



}
