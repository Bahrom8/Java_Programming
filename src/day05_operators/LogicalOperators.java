package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        //Logical AND

        double salary = 6000;
        int creditScore = 650;
        int age = 25;

        boolean eligibleForLoan = salary >=90000 && creditScore >=650 && age >=18;
        System.out.println("eligibleForLoan = " + eligibleForLoan); //false

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println("eligibleToVote = " + eligibleToVote); //true

        System.out.println("------------------------------------------------");

        // Logical OR

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println("validAnswer = " + validAnswer); //false

        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println("passedTheExam = " + passedTheExam);

        System.out.println("------------------------------------------------");

        // Logical NOT (opposite)

        System.out.println( !true );

        String a = "yes";
         boolean yes = a == "yes"; //true
         boolean no = !yes; //false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        int score = 65;
        boolean passed = score>=60;
         boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("------------------------------------------------");

        System.out.println( true == !false && false == !true && true != !true );
        //                       true      &&       true      &&      true



    }
}
