package day16_nestedloop;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while(answer.equals("yes")) {

            System.out.println("Enter your first number:");
            double num1 = input.nextDouble();

            System.out.println("Enter the math operator:");
            char o = input.next().charAt(0);

            while (!(o == '+' || o == '-' || o == '*' || o == '/')) { // while the operator is invalid
                System.err.println("Invalid operator! Please re-enter valid math operator");
                o = input.next().charAt(0);
            }

            System.out.println("Enter second number:");
            double num2 = input.nextDouble();

            double result = (o == '+') ? num1 + num2 : (o == '-') ? num1 - num2 : (o == '*') ? num1 * num2 : num1 / num2;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();

            while( !(answer.equals("yes") || answer.equals("no")) ){
                System.err.println("Invalid Answer!. Would you like to continue?");
                answer = input.next().toLowerCase();
            }

        }

    }
}
