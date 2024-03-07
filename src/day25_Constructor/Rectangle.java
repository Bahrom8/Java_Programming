package day25_Constructor;

public class Rectangle {

    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }
/*
    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

 */

    public String toString() {
        return "\n\tRectangle" +
                "\nlength: " + length +
                "\nwidth: " + width +
                "\narea: " + area();
    }
}
