package day27_accessModifiers;

public class TestNestedClassObject {

    public static void main(String[] args) {

        Car obj1 = new Car(); // car object

        obj1.new CarEngine(); // carEngine object

        new Car.StaticInnerClass();

    }

}
