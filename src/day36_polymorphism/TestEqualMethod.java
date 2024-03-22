package day36_polymorphism;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); //false

        System.out.println(circle1.equals(circle2)); //true

        System.out.println(circle1.equals(circle3)); // false

        System.out.println("-----------------------------------------");

        Iphone iphone1 = new Iphone("Apple", "iPhone 13 Pro", "Large", "Blue", 1100);

        Iphone iphone2 = new Iphone("Apple", "iPhone 13 Pro", "Large", "Black", 1100);

        Iphone iphone3 = new Iphone("Apple", "iPhone 13 Pro", "Large", "Black", 1100);

        //System.out.println(iphone1.equals(circle1));
        System.out.println(iphone1.equals(iphone2));
        System.out.println(iphone2.equals(iphone3));





    }

}
