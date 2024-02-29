package day13_customMethods;

public class returnMethodsPractice_2 {
    public static void main(String[] args) {

        System.out.println(  isOdd(100)  );

        int num = 200;
        if(isEven(50)){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }

        System.out.println(  isEven(100));

    }
    public static boolean isOdd(int num){
        //return (num % 2 != 0)? true : false;
        if(num % 2 != 0){   //another option
            return true;
        }else{
            return false;
        }

    }

    public static boolean isEven(int num){
        return !isOdd(num); // another option
             //(num % 2 == 0) ? true : false;
    }

    public static int max(int n1, int n2){
        // return n1 > n2 ? n1 : n2;
        if(n1 > n2){  // another option
            return n1;
        }else{
            return n2;
        }

    }
}
