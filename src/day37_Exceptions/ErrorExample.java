package day37_Exceptions;

import java.util.ArrayList;

public class ErrorExample {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        int i = 0;
        while (true){
            System.out.println(++i);
            pizzas.add( new Pizza('S', 2, 3));
        }

        //don't run this code




    }


}