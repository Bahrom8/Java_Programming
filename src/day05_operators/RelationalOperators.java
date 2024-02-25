package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        //Greater than

        int a = 1000;
        int b = 200;

        System.out.println( a > b ); // true
        boolean aIsGreater = a > b; //true
        System.out.println(aIsGreater);

        System.out.println("---------------------------------------");
        // Greater than or equal
         int score = 75;

         boolean passed = score >= 60; //true
        System.out.println(passed);

        int age = 21;
        boolean eligible = age >= 21;
        System.out.println(age);

        boolean eligible2 = age >=18;
        System.out.println(eligible2);

        System.out.println( 100 > 100 );  //false
        System.out.println( 100 >= 100 );  //true
        System.out.println( 100 >= 185 ); //false

        System.out.println("---------------------------------------");
        // Less than

        score = 48;
        boolean failed = score < 60;
        System.out.println(failed);

        System.out.println( 100 < 2000); //true
        System.out.println( 100 < 20 ); //false

        System.out.println("---------------------------------------");
        // Less than or equal

        System.out.println( 95 <= 100); //true
        System.out.println( 100 <= 100 );  //true
        System.out.println( 10 <= 5 ); // false

        System.out.println( 'a' > 'b' ); //false
        //                  65     66




    }
}
