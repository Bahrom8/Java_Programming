package day31_inheritnace.shape_MethodOverriding;

public final class Circle extends shape {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return radius * Math.PI*2;
    }

    @Override
    public void draw() {
        super.draw();


    }

    @Override
    public String toString() {
        return super.toString() +
                "\nradius: " + getRadius();
    }

    static void drawCircle(int radius) {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
