package day31_inheritnace.shape_MethodOverriding;

public class shape {

    private String name;

    public shape() {
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public void draw(){
        System.out.println("Drawing a " + getClass().getSimpleName() + ": ");
    }

    public String toString() {
        return "\n\r" + getClass().getSimpleName() +
                "\nname: " + name +
                "\narea: " + area() +
                "\nperimeter: " + perimeter();
    }
}
