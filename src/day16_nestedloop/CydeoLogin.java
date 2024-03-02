package day16_nestedloop;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if credentials are correct
            System.out.println("Logged in");
        }else{ // otherwise

            for (int i = 0; i < 3; i++) {
                if( i != 2){
                    System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This is your last chance, Please re-enter your username and password");
                }

                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if user enters valid credentials
                    System.out.println("You are Logged in");
                    break;  // exits the loop
                }
            }
            if( !(u.equals("Cydeo") && p.equals("WoodenSpoon"))){ // after all three attempts, if username and password still incorrect
                System.err.println("Your account is Locked, please contact with support team");
            }
        }
        input.close();
    }
}
