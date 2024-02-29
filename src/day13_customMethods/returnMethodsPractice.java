package day13_customMethods;

public class returnMethodsPractice {
    public static void main(String[] args) {
       //task 1
        isOdd(5);
        isOdd(8);

        System.out.println("-------------------------------------");

        //task 2
        isEven(4);
        isEven(9);

        System.out.println("-------------------------------------");

        //task 3

        maxNumber(78,14);
        maxNumber(15,98);

        System.out.println("-------------------------------------");

        //task 4

        minNumber(14, 77);
        minNumber(39,2);






    }

    //task 1 oddNumber
    public static int isOdd(int num){
        if( num %2 != 0){
            System.out.println("It is Odd Number");
        }else{
            System.out.println("It is not Odd Number");
        }
        return num;
    }

    //task 2 evenNumber
    public static int isEven( int num){
         if( num %2 == 0){
             System.out.println("It is Even number");
         }else{
             System.out.println("It is not Even number");
         }
         return num;

    }

    //task 3 maxNumber
    public static double maxNumber(double number1, double number2){
        if(number1 > number2){
            System.out.println(number1 + " is max Number");
        }else{
            System.out.println(number1 + " is not max Number");
        }
        return number1;
    }

    //task 4 minNumber
    public static double minNumber(double number1, double number2){
        if(number1 < number2){
            System.out.println(number1 + " is min Number");
        }else{
            System.out.println(number1 + " is not min Number");
        }
        return number1;
    }


}
/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers

Create a method named min, that can return the minimum number between two numbers

 */
