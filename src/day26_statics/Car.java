package day26_statics;

public class Car {

    public String make, model;
    public int year;
    public double price;
    public String color;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this (make); // this. make + model;
        this.model = model;
    }


    public Car(String make, String model, int year) {
        this (make, model); // this. make + model + year;
        this.year = year;
    }

    public Car(String make, String model, int year, double price) {
        this (make, model, year); // this. make + model + year + price;
        this.price = price;
    }

    public Car(String make, String model, int year, double price, String color) {
        this (make, model, year, price); // this. make + model + year + price + color;
        this.color = color;
    }

    public String toString() {
        return "\n\tCar Info" +
                "\nmake: " + make +
                "\nmodel: " + model +
                "\nyear: " + year +
                "\nprice: " + price +
                "\ncolor: " + color;
    }


}
/*
class name: Car
		 instance variables:
		 		make, model, year, price, color

	 		1st constructor: initializes the make ONLY

	 		2nd constructor: initializes make & model
	 				(MUST use constructor call to set the make)

			3rd constructor: initializes make, model, year
					(MUST use constructor call to set the make, model)

			4th constructor: initializes make, model, year, price
					(MUST use constructor call to set the make, model, year)

			5th Constructor: initializes all the instances
					(MUST use constructor call to set the make, mode, year, price, color)


		instance methods: toString
 */
