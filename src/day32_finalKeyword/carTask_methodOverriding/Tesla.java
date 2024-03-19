package day32_finalKeyword.carTask_methodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public final class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void setModel(String model) { //Array can be used and also ArrayList also usable
        //1st option
        String[] models = {"Model S", "Model X", "Model Y", "Model 3"};

        if(!Arrays.asList(models).contains(model)){ //if specified model is not valid
            throw new RuntimeException("Invalid Tesla model " + model);
        }

        super.setModel(model); // --> this.model = model;

    }

    @Override
    public void setColor(String color) { //ArrayList used for color
        // 2nd option
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("Black", "White", "Blue", "Brown", "Gray", "Silver", "Red", "Green"));

        if(!colors.contains(color)){
            throw new RuntimeException("Invalid color " + color);
        }

        super.setColor(color);
    }

    @Override
    public void setYear(int year) {

        if(year < 2008){
            throw new RuntimeException("Invalid year " + year);
        }

        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {
        if(price < 50_000){
            throw new RuntimeException("Invalid price for Tesla " + price);
        }

        super.setPrice(price);
    }


    public void autoPilot(){
        System.out.println(getMake() + " " + getModel() + " is in self-driving mode");
    }

    public void start() {
        System.out.println("Say \"Start\" to start " + getMake() + " " + getModel());
    }
}
