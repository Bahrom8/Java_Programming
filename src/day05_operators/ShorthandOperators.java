package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println(a); //20

        System.out.println(a); //20

        a = 40;
        System.out.println(a); //40
        a = 90;
        System.out.println(a); //90

        System.out.println("---------------------------------------");
        // Addition assignment

        double balance = 100;
        balance += 1000; // balance = 100 + 1000;
        System.out.println("balance = " + balance); //1100
        balance += 500;
        System.out.println("balance = " + balance); //1100+500
        balance += 10000;
        System.out.println("balance = " + balance); //11600

        System.out.println("---------------------------------------");
        // Subtraction assignment

        balance -= 1000; // balance 11600 - 1000 = 10600;
        System.out.println("balance = " + balance);
        balance -= 5000; // 5600
        System.out.println("balance = " + balance);

        System.out.println("---------------------------------------");
        // Multiplication assignment

        double salary = 45000;
        salary *= 2; // salary = 45000 * 2
        System.out.println("salary = " + salary);

        salary *= 3; // 90000 * 3
        System.out.println("salary = " + salary);

        double eth = 4;
        eth *= 250;
        System.out.println(eth);

        System.out.println("---------------------------------------");
        // Division assignment

        eth /= 2;
        System.out.println("eth = " + eth);
        System.out.println("salary = " + salary);
        salary /= 2;
        System.out.println("salary = " + salary);

        System.out.println("---------------------------------------");
        // Remainder assignment

        int b = 39;
        b %= 7; // b = 39 % 7
        System.out.println(b);




    }
}
