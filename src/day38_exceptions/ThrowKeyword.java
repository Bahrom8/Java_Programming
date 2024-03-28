package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();
        if(age < 0 || age > 150) {
            if (age < 0) {
                throw new InputMismatchException("Invalid age, cannot be less than zero: " + age);
            } else {
                throw new InputMismatchException("Invalid age, age cannot be over 150: " + age);
            }
        }

        if(age >=21 ){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("--------------------------------------");

        //throw new RuntimeException("RunTime Exception");
        //System.out.println("Hello World");

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
