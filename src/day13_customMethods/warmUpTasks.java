package day13_customMethods;

public class warmUpTasks {
    public static void main(String[] args) {

        //task 1

        calculate(10,20,'-');
        calculate(50, 40, '+');
        calculate(20, 4, '/');
        calculate(5,4,'*');
        calculate(8 , 9 , '.');

        System.out.println("--------------------------------");

        //task2

        ageGroup(255);

        System.out.println("--------------------------------");

        //task3

        eligibleToVote(28, false);

    }
        //task1
    public static void calculate(double num1, double num2, char mathOperator){

        double result = 0;
        switch (mathOperator){

            case '+': result = num1 + num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;

            case '-': result = num1 - num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;

            case '*': result = num1 * num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;

            case '/': result = num1 / num2;
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
                break;

            default:
                System.err.println("Invalid operator: " + mathOperator);
        }

    }

        //task2

    public static void ageGroup(int age){

        if(age >=0 && age <= 150){
            System.out.println(  (age <=21)? "Teenager"
                    :(age < 55)? "Adult"
                    :"Senior" );

        }else{
            System.err.println("Invalid age: " + age);
        }

    }

        //task3

    public static void eligibleToVote(int age, boolean isAmerican){

        if(age >= 18 && isAmerican){
            System.out.println("You are eligible to Vote");
        }else{
            System.err.println("You are not eligible to Vote ");
        }

    }
}
/*
1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

	    The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"

	        Ex:
	            calculate(10, 20, '+')

	        output:
	            10 + 20 = 30


	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )


    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote
 */
