package day38_exceptions.ShapeTask;

public class Circle {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if(radius <=0 ){
            throw new InvalidShapeException("Radius cannot be zero or negative: " + radius);
        }

        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle" +
                "\nRadius: " + radius;
    }
}
