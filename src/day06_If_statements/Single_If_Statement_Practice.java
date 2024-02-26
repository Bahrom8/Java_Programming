package day06_If_statements;

public class Single_If_Statement_Practice {
    public static void main(String[] args) {

        int number = 155;

        boolean isEven = number % 2 == 0;

        if(isEven){
            System.out.println("even number");
        }
        if(!isEven){
            System.out.println("Odd number");
        }

        System.out.println("===============================");

        if(number % 2 == 0){
            System.out.println("Even Number");
        }

        if(number % 2 != 0){
            System.out.println("Odd Number");
        }

    }
}
