package day26_statics;

public class iPhone {

      public static String brand = "Apple"; // static: "Appple" is the brand of all the iPhone object

    public String model; // instance: different models for iPhone objects

    public String color; // instance: different colors for iPhone objects

    public double price; // instance: different prices for iPhone objects

    public static String OS = "IOS"; // static: all iPhone objects has same operating system

    public static String madeIn = "China"; //static: all iPhone made in China

    public static boolean hasBattery = true;

    public static boolean touchScreen = true;

    public static boolean isExpensiveToFix = true;

    public iPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /*
    public static void printPhoneInfo(){ // static only accepts statics
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
    */


    public void printPhoneInfo() { // instance methods accepts both static and none static
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }


    public static void printOperatingSystem(){
        System.out.println("Operating System: " + OS);
    }


}
