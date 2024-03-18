package day31_inheritnace.shape_MethodOverriding;

public final class Square extends shape {

    public Square(double side) {
        setSide(side);
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nside: " + getSide();
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t* * * * * *");

        for (int i = 0; i < 4; i++) {
            System.out.println("\t*         *");
        }

        System.out.println("\t* * * * * *");
    }


}
