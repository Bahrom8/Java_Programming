package day06_If_statements;

public class If_and_Else_Statement_Intro {
    public static void main(String[] args) {

        int age = 28;
        if( age >= 21){
            System.out.println("Eligible");
        }

        if( age <= 21){
            System.out.println("Not Eligible");
        }

        System.out.println("=================================");

        if( age >= 18){
            System.out.println("Eligible");
        }else { //otherwise
            System.out.println("Not Eligible");
        }

    }
}
