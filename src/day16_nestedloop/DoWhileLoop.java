package day16_nestedloop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for(; condition ;){
            System.out.println("Hello Cydeo -- for Loop");
        }

        System.out.println("-------------------------------");

        while(condition){
            System.out.println("Hello Cydeo --- While Loop");
        }

        System.out.println("-------------------------------");

        do{
            System.out.println("Hello Cydeo --- do while Loop");
        }while (condition);

    }
}
