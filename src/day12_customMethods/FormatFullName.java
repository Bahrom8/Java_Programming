package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String first_name = input.nextLine().trim().replace(" ","");
        System.out.println("Enter your last name:");
        String last_name = input.nextLine().trim().replace(" ","");

        input.close();

        first_name = first_name.substring(0, 1).toUpperCase() + first_name.substring(1).toLowerCase();
            //getting first_name character of first_name name + the remaining characters of the first_name

        last_name = last_name.substring(0, 1).toUpperCase() + last_name.substring(1).toLowerCase();
            //getting last_name character of last_name  + the remaining characters of the last_name

        String full_name = first_name + " " + last_name;

        System.out.println("first_name = " + first_name);
        System.out.println("last_name = " + last_name);

        System.out.println("full_name = " + full_name);

    }
}
