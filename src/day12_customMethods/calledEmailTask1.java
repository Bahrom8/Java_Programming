package day12_customMethods;

public class calledEmailTask1 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String first_name = email.substring(0, email.indexOf("_"));
        String last_name = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));

        System.out.println("first_name = " + first_name);
        System.out.println("last_name = " + last_name);
        System.out.println("rest = " + rest);

        email = last_name + "_" + first_name + rest;
        System.out.println(email);

    }
}
