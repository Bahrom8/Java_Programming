package day27_accessModifiers;

public class TestCircleObject {

    public static void main(String[] args) {

        Circle circle = new Circle(9.5);
        Circle circle1 = new Circle(3.5);

        System.out.println(circle);
        System.out.println(circle1);

        System.out.println(Circle.PI);
        //System.out.println(Circle.radius);

    }

}
