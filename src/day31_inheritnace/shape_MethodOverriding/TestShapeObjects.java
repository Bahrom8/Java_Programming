package day31_inheritnace.shape_MethodOverriding;

public class TestShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);
        square.draw();

        System.out.println("----------------------------");

        Circle circle = new Circle(2.5);
        System.out.println(circle);
        circle.drawCircle(20);

    }

}
