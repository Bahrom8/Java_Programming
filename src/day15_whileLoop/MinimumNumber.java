package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number:");
            int num = input.nextInt(); //20, 30, -5, 100, 200

            if(num < min){  // if the user entered entry is less than the current minimum number that we have
                min = num; // then user entered number should be the minimum number
            }

        }

        System.out.println("minimum number is: " + min);
    }

}
